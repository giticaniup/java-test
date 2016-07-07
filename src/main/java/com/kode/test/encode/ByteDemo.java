package com.kode.test.encode;

/**
 * Created by zhongcy on 2016/4/20.
 */
public class ByteDemo {
    public static void main(String[] args) {
        int sourceNumber=1111;
        byte[] orderBytes = new byte[4];
        orderBytes[3] = (byte) (sourceNumber & 0xFF);
        orderBytes[2] = (byte) (sourceNumber >> 8 & 0xFF);
        orderBytes[1] = (byte) (sourceNumber >> 16 & 0xFF);
        orderBytes[0] = (byte) (sourceNumber >> 24 & 0xFF);
        for (byte b: orderBytes ){
            System.out.println(b);
        }
        System.out.println(recover(orderBytes));
    }

    public static int recover(byte[] orderBytes){
        int sourceNumber = 0;
        for (int i = 0; i < 4; i++) {
            sourceNumber <<= 8;
            sourceNumber |= orderBytes[i] & 0xff;
        }
        return sourceNumber;
    }
}
