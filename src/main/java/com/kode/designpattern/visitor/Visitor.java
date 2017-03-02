package com.kode.designpattern.visitor;

/**
 * Created by zhongcy on 2017-03-02.
 */
public class Visitor implements IVisitor{
    @Override
    public void visit(ConcreteElement1 c1) {
        c1.salary();
    }

    @Override
    public void visit(ConcreteElement2 c2) {
        c2.salary();
    }
}
