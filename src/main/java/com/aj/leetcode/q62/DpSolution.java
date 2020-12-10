package com.aj.leetcode.q62;


/**
 * @author zhangqingyue
 * @date 2020/12/10
 */
public class DpSolution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.uniquePaths(3, 11));
    }

    public int uniquePaths(int m, int n) {
        int[][] f = new int[m][n];

        for (int i = 0; i < m; ++i) {
            f[i][0] = 1;
        }
        for (int j = 0; j < n; ++j) {
            f[0][j] = 1;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
//                if (i == 0 || j == 0) {
//                    f[i][j] = 1;
//                } else {
                f[i][j] = f[i - 1][j] + f[i][j - 1];

//                }
            }
        }
        return f[m - 1][n - 1];
    }
}
