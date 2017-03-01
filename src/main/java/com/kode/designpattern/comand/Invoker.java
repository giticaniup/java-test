package com.kode.designpattern.comand;

/**
 * Created by zhongcy on 2017-03-01.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        this.command.excute();
    }
}
