package com.aj.leetcode.q509;

/**
 * @author zhangqingyue
 * @date 2021/1/4
 */
public class Solution {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int p = 0, q = 0, r = 1;
        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;

    }


}
