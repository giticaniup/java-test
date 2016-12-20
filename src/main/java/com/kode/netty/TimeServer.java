package com.kode.netty;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TimeServer
 * Created by zhongcy on 2016/12/15.
 */
public class TimeServer {
    public static void main(String[] args) {
        int port = 8088;
        ServerSocket server = null;
        try {
            server = new ServerSocket(port);
            System.out.println("server start at:" + port);
            Socket socket;
            while (true) {
                socket = server.accept();
                new Thread(new TimeHandler(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                System.out.println("The server close");
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
