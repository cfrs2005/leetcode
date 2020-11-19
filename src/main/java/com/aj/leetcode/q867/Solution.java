package com.aj.leetcode.q867;

/**
 * @author zhangqingyue
 * @date 2020/11/19
 */
public class Solution {
    public int[][] transpose(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[][] res = new int[col][row];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                res[c][r] = A[r][c];
            }
        }
        return res;
    }
}
