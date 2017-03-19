package com.kode.test.effectivejava;

import java.util.Date;

/**
 * 复杂对象的创建
 * Created by zhongcy on 2017-03-17.
 */
public class ComplexPerson {
    private String name;

    private int sex;

    private int age;

    private Date birthday;

    private int height;

    public static class Builder{
        private String name;

        private int sex;

        private int age = 0;

        private Date birthday = new Date();

        private int height = 0;

        public Builder(String name, int sex) {
            this.name = name;
            this.sex = sex;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder birthday(Date birthday){
            this.birthday = birthday;
            return this;
        }

        public Builder height(int height){
            this.height = height;
            return this;
        }

        public ComplexPerson build(){
            return new ComplexPerson(this);
        }
    }

    private ComplexPerson(Builder builder){
        this.name = builder.name;
        this.sex = builder.sex;
        this.age = builder.age;
        this.birthday = builder.birthday;
        this.height = builder.height;
    }
}
