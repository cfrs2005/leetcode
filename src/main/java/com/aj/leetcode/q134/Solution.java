package com.aj.leetcode.q134;

/**
 * @author zhangqingyue
 * @date 2020/11/18
 */
public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        // i begin set
        int i = 0;
        while (i < n) {
            int sumGas = 0;
            int sumCost = 0;
            // cnt round start
            int cnt = 0;
            while (cnt < n) {
                int j = (i + cnt) % n;
                sumCost += cost[j];
                sumGas = gas[j];
                if (sumGas < sumCost) {
                    break;
                }
                cnt++;
            }
            if (cnt == n) {
                return i;
            } else {
                i = i + cnt + 1;
            }
        }
        return -1;
    }
}
