package com.kode.test.proxy.main;


import com.kode.test.proxy.Singer;
import com.kode.test.proxy.impl.Agent;
import com.kode.test.proxy.impl.MySinger;

/**
 * Created by zhongcy on 2016/6/3.
 */
public class Test {
    public static void main(String[] args) {
        //
        Agent agent =new Agent();
        Singer s= (Singer) agent.bind(new MySinger());
        s.sing();
    }
}
