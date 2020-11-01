package com.aj.leetcode.q13;

/**
 * https://leetcode-cn.com/problems/roman-to-integer/submissions/
 *
 * @author zhangqingyue
 * @date 2020/11/1
 */
public class Solution {
    /**
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        s = s.replace("IV", "a");
        s = s.replace("IX", "b");
        s = s.replace("IL", "c");
        s = s.replace("IC", "d");
        s = s.replace("ID", "e");
        s = s.replace("IM", "f");
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            ret += getCount(s.charAt(i));
        }
        return ret;
    }

    /**
     * @param ch
     * @return
     */
    private int getCount(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            case 'a':
                return 4;
            case 'b':
                return 9;
            case 'c':
                return 49;
            case 'd':
                return 99;
            case 'e':
                return 499;
            case 'f':
                return 999;
        }
        return 0;
    }

}
