package com.kode.designpattern.mediator;

/**
 * 抽象同事类
 * Created by zhongcy on 2017-03-01.
 */
public class AbstractColleague {
    protected AbstractMediator abstractMediator;

    public AbstractColleague(AbstractMediator abstractMediator) {
        this.abstractMediator = abstractMediator;
    }
}
