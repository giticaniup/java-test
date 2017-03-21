package com.kode.designpattern.builder;

import java.util.List;

/**
 * Created by zhongcy on 2017-02-28.
 */
public class BenzBuilder implements CarBuilder {
    BenzModel benzModel = new BenzModel();

    @Override
    public void setSeq(List<String> list) {
        benzModel.setSeq(list);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
