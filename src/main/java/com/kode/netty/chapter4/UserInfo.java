package com.kode.netty.chapter4;

import com.google.common.base.MoreObjects;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

/**
 * 用户信息，用于测试序列化
 * Created by zhongcy on 2016/12/21.
 */
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 2842719577254084337L;

    private String userName;

    private int userId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("userName", userName)
                .add("userId", userId)
                .toString();
    }

    public byte[] codec() {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        byte[] value = this.userName.getBytes();
        buffer.putInt(value.length);
        buffer.put(value);
        buffer.putInt(this.userId);
        //倒置，准备读数据
        buffer.flip();
        byte[] result = new byte[buffer.remaining()];
        //将数据读取到result数据中
        buffer.get(result);
        return result;
    }

    public byte[] codec(ByteBuffer buffer) {
        buffer.clear();
        byte[] value = this.userName.getBytes();
        buffer.putInt(value.length);
        buffer.put(value);
        buffer.putInt(this.userId);

        buffer.flip();
        byte[] result = new byte[buffer.remaining()];
        buffer.get(result);
        return result;
    }

    public UserInfo buildUserId(int id) {
        this.userId = id;
        return this;
    }

    public UserInfo buildUserName(String name) {
        this.userName = name;
        return this;
    }

    @Test
    public void test() {
        UserInfo info = new UserInfo().buildUserId(1).buildUserName("zhongcy test java serialization");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream os = new ObjectOutputStream(bos);
            os.writeObject(info);
            os.flush();
            os.close();
            byte[] b = bos.toByteArray();
            System.out.println("java serialize:" + b.length);
            bos.close();
            System.out.println("userDefine:" + info.codec().length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSpeed() throws IOException {
        UserInfo info = new UserInfo().buildUserId(1).buildUserName("zhongcy test java serialization");
        ByteArrayOutputStream bos;
        ObjectOutputStream os;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            bos = new ByteArrayOutputStream();
            os = new ObjectOutputStream(bos);
            os.writeObject(info);
            os.flush();
            os.close();
            byte[] b = bos.toByteArray();
            bos.close();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            info.codec(buffer);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
