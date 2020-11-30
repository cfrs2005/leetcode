package com.aj.leetcodeoffer.q65;

/**
 * @author zhangqingyue
 * @date 2020/11/30
 */
public class Solution {
    public int add(int a, int b) {
        if (b == 0) {
            return a;
        }
        while (b != 0) {
            int c = (b & a) << 1;
            a = a ^ b;
            b = c;
        }
        return a;
    }

}
