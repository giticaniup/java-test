package com.kode.test.exception;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * Created by zhongcy on 2016/8/8.
 */
public class ExceptionDemo01 {
    public  void getIp() throws SocketException {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        System.out.println(1);
    }
}
