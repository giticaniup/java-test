package com.kode.concurrent.share;

/**
 * 锁消除测试：
 * 默认：JVM会做锁消除的优化
 * 执行时：-server -XX:+DoEscapeAnalysis -XX:-EliminateLocks去除锁消除会影响性能
 */
public class TestLockEliminate {

    //sb.append()
    private static String getString(String s1, String s2) {
        StringBuffer sb = new StringBuffer();
        sb.append(s1);
        sb.append(s2);
        return sb.toString();
    }

    public static void main(String[] args) {
        long tsStart = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            getString("TestLockEliminate ", "Suffix");
        }
        System.out.println("一共耗费：" + (System.currentTimeMillis() - tsStart) + " ms");
    }
}