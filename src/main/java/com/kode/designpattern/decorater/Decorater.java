package com.kode.designpattern.decorater;

/**
 * 抽象装饰器类，注意继承Component类
 * Created by zhongcy on 2017-03-02.
 */
public abstract class Decorater extends Component{
    private Component component;

    public Decorater(Component component) {
        this.component = component;
    }

    @Override
    public void execute() {
        this.component.execute();
    }
}
