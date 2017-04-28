package com.kode.test.test;

import com.google.common.base.Joiner;
import org.junit.Test;

/**
 * Gson Joiner
 * Created by kodezhong on 2017/4/18.
 */
public class JoinerTest {
    @Test
    public void test(){
        System.out.println(Joiner.on(",").join("1","2","3"));
    }
}
