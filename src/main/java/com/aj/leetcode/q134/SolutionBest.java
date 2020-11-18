package com.aj.leetcode.q134;

/**
 * @author zhangqingyue
 * @date 2020/11/18
 */
public class SolutionBest {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int spare = 0;
        // car gas limit
        int minSpare = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            // round get gas
            spare += gas[i] - cost[i];
            // lastGas set to minGas
            if (spare < minSpare) {
                minSpare = spare;
                minIndex = i;
            }
        }
        return spare < 0 ? -1 : (minIndex + 1) % n;
    }
}
