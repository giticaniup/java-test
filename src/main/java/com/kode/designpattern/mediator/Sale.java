package com.kode.designpattern.mediator;

/**
 * Created by zhongcy on 2017-03-01.
 */
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    public void sale(int num) {
        super.abstractMediator.excute("sale");
    }

    public void priceDownSale(int num) {
        System.out.println("打折销售");
    }
}
