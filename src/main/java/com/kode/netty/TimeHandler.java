package com.kode.netty;

import org.apache.commons.lang.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

/**
 * TimerHandler
 * Created by zhongcy on 2016/12/15.
 */
public class TimeHandler implements Runnable{

    Socket socket;

    public TimeHandler(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            //需要将autoFlush参数设置为true，否则不输出
            out = new PrintWriter(this.socket.getOutputStream(),true);
            String body;
            while (true) {
                body = in.readLine();
                if(body==null) {
                    System.out.println("I'd break");
                    break;
                }
                System.out.println("server receive order:"+body);
                if(StringUtils.equalsIgnoreCase("TIME",body)){
                    System.out.println("equals");
                    out.println(new Date(System.currentTimeMillis()).toString());
                }else {
                    out.println("BAD ORDER");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(out!=null){
                out.close();
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
