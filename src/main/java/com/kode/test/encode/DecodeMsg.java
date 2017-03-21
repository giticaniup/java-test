package com.kode.test.encode;

/**
 * Created by zhongcy on 2016/4/20.
 */
public class DecodeMsg {
    public static void main(String[] args) throws Exception {
        DecodeUtil util = new DecodeUtil("pamtest", "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFG", "wxb11529c136998cb6");
        String result = util.decrypt("C7zXBy5CK+tmEIaDStMWOlSQc0Dyc67Eu9Ipj4d+lMToTx0lucsB0F0JadrbGg6r9+PaThiRRDLpf4j+Qiw7ag==");
        System.out.println("\n" + result);
    }
}
