package com.kode.designpattern.mediator;

/**
 * 中介者模式
 * MVC模式的C就是中介者的体现
 * Created by zhongcy on 2017-03-01.
 */
public class Main {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mideator();
        Sale sale = new Sale(mediator);
        Stock stock = new Stock(mediator);
        sale.sale(1);
        stock.stock();
    }
}
