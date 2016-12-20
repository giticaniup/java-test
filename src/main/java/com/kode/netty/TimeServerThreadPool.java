package com.kode.netty;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * server端使用线程池实现
 * Created by zhongcy on 2016/12/19.
 */
public class TimeServerThreadPool {
    public static void main(String[] args) {
        int port = 8088;
        ExecutorService executor = Executors.newFixedThreadPool(2 * 4 + 1);
        ServerSocket server;
        Socket socket;
        try {
            server = new ServerSocket(port);
            socket = server.accept();
            executor.execute(new TimeHandler(socket));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
