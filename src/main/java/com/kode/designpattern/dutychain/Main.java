package com.kode.designpattern.dutychain;

import java.util.Arrays;

/**
 * 构造一个责任链，一直找到合适处理的节点
 * Created by zhongcy on 2017-03-02.
 */
public class Main {
    public static void main(String[] args) {
        HandlerFactory handlerFactory = new HandlerFactory();
        handlerFactory.setSuccessors(Arrays.asList(new Employee(), new Manager(), new Boss()));
        handlerFactory.handleEvent(1);
    }
}
