package com.aj.leetcode.q85;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author zhangqingyue
 * @date 2020/12/26
 */
public class Solution {

    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int res = 0;
        int[] heights = new int[n + 2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                heights[j + 1] = matrix[i][j] == '0' ? 0 : 1 + heights[j + 1];
            }
            Deque<Integer> stack = new ArrayDeque<>(m);
            stack.addLast(0);
            for (int j = 1; j < heights.length; j++) {
                while (heights[j] < heights[stack.peekLast()]) {
                    int h = heights[stack.pollLast()];
                    int w = j - stack.peekLast() - 1;
                    res = Math.max(res, h * w);
                }
                stack.addLast(j);
            }
        }
        return res;
    }
}
