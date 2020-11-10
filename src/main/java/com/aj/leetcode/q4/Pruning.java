package com.aj.leetcode.q4;

/**
 * @author zhangqingyue
 * @date 2020/11/10
 */
public class Pruning {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int rowsLength = matrix.length;
        int colsLength = matrix[0].length;

        int i = rowsLength - 1;
        int j = 0;
        while (i >= 0 && j < colsLength) {
            if (matrix[i][j] > target) {
                i--;
            } else if (matrix[i][j] < target) {
                j++;
            } else {
                return true;
            }
        }
        return false;


    }
}
