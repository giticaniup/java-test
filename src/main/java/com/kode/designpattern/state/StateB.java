package com.kode.designpattern.state;

/**
 * 状态B
 * Created by zhongcy on 2017-03-03.
 */
public class StateB extends State{
    @Override
    public void handle(Context context) {
        System.out.println("StateB is handle");
        context.setState(new StateA());
    }
}
