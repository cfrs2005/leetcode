package com.aj.leetcode.q322;

/**
 * @author zhangqingyue
 * @date 2020/12/10
 */
public class Solution {


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] coins = new int[]{1, 2, 5};
        System.out.println(solution.coinChange(coins, 11));
    }

    public int coinChange(int[] coins, int amount) {
        int[] f = new int[amount + 1];
        f[0] = 0;
        for (int i = 1; i <= amount; i++) {
            f[i] = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j] && f[i - coins[j]] != Integer.MAX_VALUE) {
                    f[i] = Math.min(f[i - coins[j]] + 1, f[i]);
                }
                System.out.println(f[i]);
            }
        }
        if (f[amount] == Integer.MAX_VALUE) {
            f[amount] = -1;
        }
        return f[amount];
    }
}
