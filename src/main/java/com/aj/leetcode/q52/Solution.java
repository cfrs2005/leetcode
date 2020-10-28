package com.aj.leetcode.q52;

/**
 * @author zhangqingyue
 * @date 2020/10/28
 */
public class Solution {

    public void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, -5, -2, -4, 3};
        System.out.println(solution.maxProduct(nums));
    }

    public int maxProduct(int[] nums) {
        int maxNum = nums[0], minNum = nums[0], result = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            int tmpMax = maxNum, tmpMin = minNum;
            maxNum = Math.max(tmpMax * nums[i], Math.max(nums[i], tmpMin * nums[i]));
            minNum = Math.min(tmpMin * nums[i], Math.min(nums[i], tmpMax * nums[i]));
            result = Math.max(maxNum, result);
        }
        return result;

    }
}

