package com.kode.designpattern.builder;

import java.util.List;

/**
 * Created by zhongcy on 2017-02-28.
 */
public interface CarBuilder {
    void setSeq(List<String> list);

    CarModel getCarModel();
}
