package com.kode.designpattern.state;

/**
 * 状态A
 * Created by zhongcy on 2017-03-03.
 */
public class StateA extends State {
    @Override
    public void handle(Context context) {
        System.out.println("StateA is handle");
        context.setState(new StateB());
    }
}
