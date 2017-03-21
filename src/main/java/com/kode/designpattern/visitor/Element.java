package com.kode.designpattern.visitor;

/**
 * 抽象Element
 * Created by zhongcy on 2017-03-02.
 */
public interface Element {
    int salary();

    void accept(IVisitor IVisitor);
}
