package com.kode.designpattern.comand;

/**
 * 具体命令类1
 * Created by zhongcy on 2017-03-01.
 */
public class ConcreteCommand1 extends Command {
    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        this.receiver.doSomething();
    }
}
