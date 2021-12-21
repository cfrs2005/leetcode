package com.aj.testlearn;

/**
 * @author zhangqingyue
 * @date 2021/5/10
 */
public class TestLength {

    public static void main(String[] args) {
        int year = 2019;
        int month = 5;
        int length = 2;
        System.out.println(String.format("%0" + length + "d", month));
    }
}
