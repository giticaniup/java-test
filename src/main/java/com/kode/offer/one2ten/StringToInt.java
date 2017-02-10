package com.kode.offer.one2ten;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 把字符串转为整数
 * 注意考虑异常情况
 * 正则表达式：[]、*、+、?、.、|
 * .用于匹配除\r外任意字符
 * subString左包括右不包括
 * Created by zhongcy on 2017/2/8.
 */
public class StringToInt {
    public static int stringToint(String s) {
        if (s == null) {
            throw new RuntimeException("输入为空");
        }
        Pattern pattern = Pattern.compile("[0-9]");
        int result = 0;
        boolean negFlag = false;
        String first = s.substring(0, 1);
        if ("-".equals(first)) {
            negFlag = true;
        } else {
            Matcher matcher = pattern.matcher(first);
            if (matcher.matches()) {
                result = Integer.valueOf(first);
            }
        }

        for (int i = 1; i < s.length(); i++) {
            String subStr = s.substring(i, i+1);
            Matcher matcher = pattern.matcher(subStr);
            if (!matcher.matches()) {
                throw new RuntimeException("输入不合法");
            }
            if((!negFlag && result>Integer.MAX_VALUE/10)|| (negFlag&& result+Integer.MIN_VALUE/10>0)){
                return negFlag?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            result = result*10+Integer.valueOf(subStr);
        }
        if(negFlag){
            return -result;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "-12112311211212121";
        System.out.println(stringToint(s));
    }
}
