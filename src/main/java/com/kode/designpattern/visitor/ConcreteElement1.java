package com.kode.designpattern.visitor;

/**
 * Created by zhongcy on 2017-03-02.
 */
public class ConcreteElement1 implements Element {
    @Override
    public int salary() {
        return 1;
    }

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
