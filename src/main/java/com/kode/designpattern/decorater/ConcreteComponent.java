package com.kode.designpattern.decorater;

/**
 * Created by zhongcy on 2017-03-02.
 */
public class ConcreteComponent extends Component{
    @Override
    public void execute() {
        System.out.println("component is excute");
    }
}
