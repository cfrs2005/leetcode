package com.aj.leetcode.q463;

/**
 * @author zhangqingyue
 * @date 2020/10/28
 */
public class Solution {

    public int islandPerimeter(int[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == 1) {
                    return dfs(grid, row, col);
                }
            }
        }
        return 0;
    }

    private int dfs(int[][] grid, int row, int col) {
        //if (!(row >= 0 && col >= 0 && row < grid.length && col < grid[row].length)) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[row].length) {
            return 1;
        }
        System.out.println(row + "_" + col);
        if (grid[row][col] == 0) {
            return 1;
        }
        if (grid[row][col] != 1) {
            return 0;
        }
        grid[row][col] = 2;
        return dfs(grid, row + 1, col) +
                dfs(grid, row - 1, col) +
                dfs(grid, row, col + 1) +
                dfs(grid, row, col - 1);

    }
}

