package com.kode.designpattern.state;

/**
 * 定义client需要的接口和定义状态实例
 * Created by zhongcy on 2017-03-03.
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}
