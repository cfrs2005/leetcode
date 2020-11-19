package com.aj.leetcode.q283;

/**
 * @author zhangqingyue
 * @date 2020/11/19
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length <= 0) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }

}
