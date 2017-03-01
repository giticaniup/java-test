package com.kode.designpattern.mediator;

/**
 * Created by zhongcy on 2017-03-01.
 */
public class Stock extends AbstractColleague {
    private static int COMPUTER_NUM = 100;

    public Stock(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    public void stock() {
        super.abstractMediator.excute("stock", 100);
    }

    public void increase(int num) {
        COMPUTER_NUM += num;
    }

    public void decrease(int num) {
        COMPUTER_NUM -= num;
    }
}
