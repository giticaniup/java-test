package com.kode.leetcode;

import org.junit.Test;

/**
 * Created by zhongchengyong on 2017/5/3.
 */
public class ZigZagSolution {
    public String convert(String s, int numRows) {
        int gap = (numRows - 1) * 2;
        if(gap == 0){
            return s;
        }
        if(gap < 0){
            throw new RuntimeException();
        }
        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            if (i >= s.length()) {
                break;
            }
            if (i == 0 || i == numRows - 1) {
                flag = false;
            }
            StringBuilder sb1 = new StringBuilder(String.valueOf(s.charAt(i)));
            for (int j = i + gap; j - i*2 < s.length(); j += gap) {
                if (flag) {
                    sb1.append(String.valueOf(s.charAt(j - i * 2)));
                    if(j < s.length()){
                        sb1.append(String.valueOf(s.charAt(j)));
                    }
                } else {
                    if(j<s.length()){
                        sb1.append(String.valueOf(s.charAt(j)));
                    }
                }
            }
            sb.append(sb1);
            flag = true;
        }
        return sb.toString();
    }

    @Test
    public void test() {
        String s = "PAYPALISHIRING";
        int row = 3;
        System.out.println(convert(s, row));
        System.out.println("PAHNAPLSIIGYIR".equals(convert(s, row)));
    }
}
