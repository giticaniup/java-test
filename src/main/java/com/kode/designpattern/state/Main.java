package com.kode.designpattern.state;

/**
 * 状态模式：当一个对象内在状态变更时允许改变其行为，这个对象看起来就像是改变了类
 * 定义一个外部接口需要的上下文Context，关联对应的状态state
 * 在处理时同时变更状态，最好的例子是电灯的开关，在处理电灯状态的同时变更state
 * Created by zhongcy on 2017-03-03.
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new StateA());
        context.request();
        context.request();
        context.request();
        context.request();
    }
}
