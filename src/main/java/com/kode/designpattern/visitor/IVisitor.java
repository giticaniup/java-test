package com.kode.designpattern.visitor;

/**
 * Created by zhongcy on 2017-03-02.
 */
public interface IVisitor {
    void visit(ConcreteElement1 c1);

    void visit(ConcreteElement2 c2);
}
