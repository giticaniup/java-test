package com.kode.vm;

import java.util.ArrayList;
import java.util.List;

/**
 * 程序抛出OutOfMemory异常
 * Created by zhongcy on 2017/1/26.
 */
public class OutOfMemoryDemo {
    static class OMMObject {

    }

    public static void main(String[] args) {
        List<OMMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OMMObject());
        }
    }
}
