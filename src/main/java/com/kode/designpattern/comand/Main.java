package com.kode.designpattern.comand;

/**
 * 将请求封装为对象，从而使用不同的请求使客户端参数化
 * 高层次的调用方不用知道具体是谁实现
 * Created by zhongcy on 2017-03-01.
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new ConcreteReceiver1();
        Command command = new ConcreteCommand1(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
