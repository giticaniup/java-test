package com.kode.designpattern.dutychain;

/**
 * Created by zhongcy on 2017-03-01.
 */
public class Employee extends Handler{
    @Override
    public void handle(int day) {
        if(day<3){
            System.out.println("员工处理");
        }else {
            if(getSuccessor()!=null){
                getSuccessor().handle(day);
            }
        }
    }
}
