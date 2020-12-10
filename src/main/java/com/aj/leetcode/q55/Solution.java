package com.aj.leetcode.q55;

/**
 * @author zhangqingyue
 * @date 2020/12/10
 */
public class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] f = new boolean[n];
        f[0] = true;
        for (int j = 1; j < n; j++) {
            f[j] = false;
            for (int i = 0; i < j; i++) {
                if (f[i] && i + nums[i] >= j) {
                    f[j] = true;
                    break;
                }
            }
        }
        return f[n - 1];

    }
}
