package com.kode.designpattern.backup;

import com.google.common.base.MoreObjects;

/**
 * 封装一个状态备份在内部类中
 * Created by zhongcy on 2017-03-02.
 */
public class Origin {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createBackup(String state) {
        return new Memento(state);
    }

    public void restoreBackup(Memento memento) {
        setState(memento.getState());
    }

    static class Memento {

        private String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("state", state)
                .toString();
    }
}
