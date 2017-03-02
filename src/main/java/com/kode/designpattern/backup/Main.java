package com.kode.designpattern.backup;

/**
 * 备忘录模式
 * 将类中的状态备份，以便可以还原
 * Created by zhongcy on 2017-03-02.
 */
public class Main {
    public static void main(String[] args) {
        Origin origin = new Origin();
        origin.setState("new");
        Origin.Memento memento = origin.createBackup(origin.getState());
        origin.setState("old");
        origin.restoreBackup(memento);
        System.out.println(origin);
    }
}
