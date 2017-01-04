package com.kode.test;

import com.kode.LoginInfo;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 使用transient修饰的变量，不参与序列化
 * 另外：Java序列化是不能序列化static变量的，因为其保存的是对象的状态，而static变量保存在全局数据区，
 * 在对象未实例化时就已经生成，属于类的状态。
 * Created by zhongcy on 2016/12/27.
 */
public class TransientDemo2 {
    @Test
    public void serializeObj() throws IOException {
        LoginInfo info = new LoginInfo("zhongcy", "112");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream
                ("D:\\study\\java-test\\src\\main\\java\\com\\kode\\test\\info.out"));
        out.writeObject(info);
        out.close();
        System.out.println("write success");
    }

    @Test
    public void readFromObj() throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("info.out"));
        LoginInfo info = (LoginInfo) input.readObject();
        System.out.println(info);
    }
}
