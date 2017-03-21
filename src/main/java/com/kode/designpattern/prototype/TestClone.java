package com.kode.designpattern.prototype;

/**
 * Created by zhongcy on 2017-03-01.
 */
public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail("test");
        String[] strArr = {"1", "2"};
        mail.setStrings(strArr);
        mail.setStringList("1");
        System.out.println(mail);

        Mail newMail = mail.clone();
        String[] strArr2 = {"3", "4"};
        newMail.setStrings(strArr2);
        newMail.setStringList("2");
        System.out.println(newMail);
        System.out.println(mail);
    }
}
