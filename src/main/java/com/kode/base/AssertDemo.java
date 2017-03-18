package com.kode.base;

/**
 * 不建议使用
 */
public class AssertDemo{

    private String name;

    private AssertDemo(String name){
        this.name = name;
    }
    public void setName(String nameStr){
        this.name = nameStr;
    }
    public String getName(){
        return this.name;
    }
    public static void main(String[] args){
        AssertDemo personObj = new AssertDemo("Abner Chai");
        String personName = null;
        personName=personObj.getName();
        assert personName!=null;
        System.out.println(personName.length());
    }
}