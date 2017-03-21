package com.kode.designpattern.decorater;

/**
 * Created by zhongcy on 2017-03-02.
 */
public class ConcreteDecorater extends Decorater {
    public ConcreteDecorater(Component component) {
        super(component);
    }

    private void method1() {
        System.out.println("装饰器方法");
    }

    @Override
    public void execute() {
        method1();
        super.execute();
    }
}
