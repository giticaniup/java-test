package com.kode.designpattern.flyweight;

/**
 * Created by zhongcy on 2017-03-03.
 */
public class ConcreteFlyWeight extends FlyWeight {
    public ConcreteFlyWeight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void execute() {
        System.out.println("concreteFlyWeight");
    }
}
