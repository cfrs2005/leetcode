package com.aj.leetcode.q53;

/**
 * @author zhangqingyue
 * @date 2020/11/5
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int res = 0;
        int maxAns = nums[0];
        if (nums.length <= 0) {
            return res;
        }
        for (int val : nums) {
            res = Math.max(val, res + val);
            maxAns = Math.max(res, maxAns);
        }
        return maxAns;
    }
}
