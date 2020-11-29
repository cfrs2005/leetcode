package com.aj.leetcode.q976;

import java.util.Arrays;

/**
 * @author zhangqingyue
 * @date 2020/11/29
 */
public class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; --i) {
            if (A[i - 2] + A[i - 1] > A[i]) {
                return A[i - 2] + A[i - 1] + A[i];
            }
        }
        return 0;
    }
}


