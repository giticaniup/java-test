package com.kode.book.javainterview.designpattern;

/**
 * a demo for builder pattern
 * Created by zhongchengyong on 2017/7/2.
 */
public class BuilderDemo {

    private int type;
    private String name;

    private BuilderDemo(int type, String name) {
        this.type = type;
        this.name = name;
    }

    static class Builder{
        private int type;
        private String name;

        public Builder withType(int type){
            this.type = type;
            return this;
        }

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public BuilderDemo build(){
            return new BuilderDemo(type,name);
        }
    }
}
