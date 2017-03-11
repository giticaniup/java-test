package com.kode.designpattern.flyweight;

/**
 * Created by zhongcy on 2017-03-03.
 */
public abstract class FlyWeight {
    private String intrinsic;

    protected final String extrinsic;

    public FlyWeight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

    public abstract void execute();
}
