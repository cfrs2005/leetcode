package com.aj.leetcodeoffer.q17;

/**
 * @author zhangqingyue
 * @date 2020/11/28
 */
public class Solution {
    public int[] printNumbers(int n) {
        int end = (int) Math.pow(10, n) - 1;
        int[] res = new int[end];
        for (int i = 0; i < end; i++) {
            res[i] = i + 1;
        }
        return res;
    }

}
