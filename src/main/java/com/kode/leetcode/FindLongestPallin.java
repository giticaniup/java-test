package com.kode.leetcode;

import org.junit.Test;

/**
 * 寻找最长的回文数
 * Created by zhongchengyong on 2017/4/15.
 */
public class FindLongestPallin {
    int maxLength, beginIndex;

    public String longestPalindrome(String s) {
        int length = s.length();
        if (length < 2) return s;
        for (int i = 0; i < length - 1; i++) {
            getPallinIndex(s, i, i);//奇数
            getPallinIndex(s, i, i + 1);
        }
        return s.substring(beginIndex, beginIndex + maxLength);
    }

    private void getPallinIndex(String str, int i, int j) {
        while (i >= 0 && j < str.length() && str.charAt(i) == str.charAt(j)) {
            i--;
            j++;
        }
        if (maxLength < j - i - 1) {
            maxLength = j - i - 1;
            beginIndex = i + 1;
        }
    }

    @Test
    public void test() {
        String s = "cbabcsadfaf";
        System.out.println(longestPalindrome(s));
    }

}
