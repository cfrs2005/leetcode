package com.aj.leetcode.q62;

/**
 * @author zhangqingyue
 * @date 2020/12/9
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        long ans = 1;
        for (int x = n, y = 1; y < m; x++, y++) {
            ans = ans * x / y;
        }
        return (int) ans;
    }
}
