package com.aj.leetcode.q4;

/**
 * @author zhangqingyue
 * @date 2020/11/10
 */
public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        boolean result = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    result = true;
                    return result;
                }
            }
        }
        return result;
    }
}
