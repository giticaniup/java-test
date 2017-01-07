package com.kode.test.javaBase;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhongcy on 2016/12/24.
 */
public class FinalTest {

    @Test
    public void testFinal(){
        FinalDemo finalDemo = new FinalDemo(new ArrayList<>());
        List<String> list = finalDemo.getList();
        list.add("1");
        System.out.println(finalDemo);
    }
}
