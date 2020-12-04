package com.aj.leetcode.q239;

import java.util.Arrays;

/**
 * @author zhangqingyue
 * @date 2020/12/4
 */
public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] ab = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int[] result = solution.maxSlidingWindow(ab, 3);
        System.out.println(Arrays.toString(result));
    }

    /**
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length - k + 1; ++i) {
            int tmp = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                tmp = Math.max(tmp, nums[j]);
            }
            ans[i] = tmp;
        }
        return ans;
    }
}
