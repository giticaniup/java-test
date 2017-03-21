package com.kode.test.encode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhongcy on 2016/4/20.
 */
public class EncodeTest {
    @Test
    public void encodeMsg() throws Exception {
        String randomStr = "cccabbbbccccdddd";
        EncodeUtil util = new EncodeUtil("pamtest", "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFG", "wxb11529c136998cb6");
        randomStr = util.getRandomStr();
        String result = util.encrypt(randomStr, "我是中文abcd123");
        System.out.println(result);
        assertEquals(result, "XBRKidaAzzKE2nRGjQq5Q2sshC0N9hU+tTDfpHXf9Pvz/d62VWqGo7YD9ZBSJYtaTi3vr8dXhzaxiQ5hXArw0A==");
        //jn1L23DB+6ELqJ+6bruv29Eva8/26oahxMMn6GEISpKC5i/mm53NuumvIFVRn2WNoh6c9+PvhbY5SsucQPp+PA==
    }
}
