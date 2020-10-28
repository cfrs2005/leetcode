package com.aj.leetcode.q200;

/**
 * @author zhangqingyue
 * @date 2020/10/28
 */
public class Solution {
    // 解题思路 为 染色
    public int numIslands(char[][] grid) {
        int numsLand = 0;
        for (int col = 0; col < grid.length; col++) {
            for (int row = 0; row < grid[col].length; row++) {
                if (grid[col][row] == '1') {
                    numsLand++;
                    dfs(grid, col, row);
                }
            }
        }
        return numsLand;
    }

    void dfs(char[][] grid, int col, int row) {
        if (col < 0 || row < 0 || col >= grid.length || row >= grid[col].length || grid[col][row] == '0') {
            return;
        }
        grid[col][row] = '0';
        dfs(grid, col + 1, row);
        dfs(grid, col - 1, row);
        dfs(grid, col, row + 1);
        dfs(grid, col, row - 1);

    }
}

