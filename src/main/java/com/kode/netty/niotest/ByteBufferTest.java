package com.kode.netty.niotest;

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * ByteBuffer测试，读写切换的过程中需要调用flip方法
 * Created by zhongchengyong on 2017/4/4.
 */
public class ByteBufferTest {
    @Test
    public void testFlip(){
        String s = "test ByteBuffer";
        ByteBuffer buffer = ByteBuffer.allocate(100);
        buffer.put(s.getBytes());
        System.out.println("flip前:"+buffer.remaining());
        buffer.flip();

        byte[] bytes = new byte[buffer.remaining()];
        System.out.println("flip后:"+buffer.remaining());

        buffer.get(bytes);
        String decodeValue = new String(bytes);
        System.out.println(decodeValue);
    }
}
