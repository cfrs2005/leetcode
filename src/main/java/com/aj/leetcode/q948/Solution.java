package com.aj.leetcode.q948;

import sun.tools.jstat.Token;

import java.util.Arrays;

/**
 * @author zhangqingyue
 * @date 2020/11/17
 */
public class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int lo = 0, hi = tokens.length - 1;
        int points = 0, ans = 0;
        while (lo <= hi && (P > tokens[lo] || points > 0)) {
            while (lo <= hi && P >= tokens[lo]) {
                P -= tokens[lo++];
                points++;
            }
            ans = Math.max(ans, points);
            while (lo <= hi && points > 0) {
                P += tokens[hi--];
                points--;
            }
        }
        return ans;
    }
}
