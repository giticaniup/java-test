package com.kode.designpattern.prototype;

import com.google.common.base.MoreObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhongcy on 2017-03-01.
 */
public class Mail implements Cloneable{
    private String mailSubject;

    private String mailContext;

    private String[] strings;

    private List<String> stringList = new ArrayList<>();

    public Mail() {
    }

    public Mail(String mailSubject) {
        this.mailSubject = mailSubject;
    }

    public String getMailSubject() {
        return mailSubject;
    }

    public void setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
    }

    public String getMailContext() {
        return mailContext;
    }

    public void setMailContext(String mailContext) {
        this.mailContext = mailContext;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(String s) {
        this.stringList.add(s);
    }

    @Override
    protected Mail clone() throws CloneNotSupportedException {
        return (Mail)super.clone();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("mailSubject", mailSubject)
                .add("mailContext", mailContext)
                .add("strings", Arrays.toString(strings))
                .add("stringList",stringList)
                .toString();
    }
}
