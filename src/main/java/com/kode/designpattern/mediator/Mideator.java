package com.kode.designpattern.mediator;

/**
 *
 * Created by zhongcy on 2017-03-01.
 */
public class Mideator extends AbstractMediator{
    @Override
    public void excute(String s, Object... objects) {
        if("sale".equals(s)){
            saleComputer(objects);
        }else if("stock".equals(s)){
            stockComputer(objects);
        }
    }

    private void stockComputer(Object... objects) {
        super.stock.increase(100);
        super.sale.priceDownSale(100);
    }

    private void saleComputer(Object... objects) {
        super.sale.priceDownSale(100);
        super.stock.decrease(1);
    }
}
