package com.kode.designpattern.builder;

import java.util.Arrays;
import java.util.List;

/**
 * 建造者模式：将复杂对象的构建和表示分开，使得相同的构造过程创建不同的表示
 * 工程模式(创建对象)+模板模式(决定顺序)的结合
 * Created by zhongcy on 2017-02-28.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("boom", "start", "stop");
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSeq(list);
        CarModel carModel = benzBuilder.getCarModel();
        carModel.run();
    }
}
