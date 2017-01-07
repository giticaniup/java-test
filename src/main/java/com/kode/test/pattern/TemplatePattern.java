package com.kode.test.pattern;

/**
 * 模板模式
 * 类似的还有定义一个排序的算法，分别实现int的排序和float的实现
 * Created by zhongcy on 2016/11/3.
 */
abstract class Coder {
    public void code() {
        openComputer();
        printCode();
    }

    abstract protected void openComputer();

    abstract protected void printCode();
}

class Boy extends Coder{

    @Override
    protected void openComputer() {
        System.out.println("boy openComputer");
    }

    @Override
    protected void printCode() {
        System.out.println("boy printCode");
    }
}

class Girl extends Coder{

    @Override
    protected void openComputer() {
        System.out.println("girl openComputer");
    }

    @Override
    protected void printCode() {
        System.out.println("girl printCode");
    }
}

public class TemplatePattern {
    public static void main(String[] args) {
        Coder boy = new Boy();
        boy.code();
        Coder girl = new Girl();
        girl.code();

    }
}
