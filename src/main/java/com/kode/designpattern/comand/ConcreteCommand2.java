package com.kode.designpattern.comand;

/**
 * 具体命令类2
 * Created by zhongcy on 2017-03-01.
 */
public class ConcreteCommand2 extends Command {
    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        this.receiver.doSomething();
    }
}
