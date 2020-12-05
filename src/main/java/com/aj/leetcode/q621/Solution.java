package com.aj.leetcode.q621;

/**
 * @author zhangqingyue
 * @date 2020/12/5
 */
public class Solution {

    public int leastInterval(char[] tasks, int n) {
        int[] cnt = new int[26];
        for (char c : tasks) {
            cnt[c - 'A']++;
        }
        int max = 0;
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, cnt[i]);
        }
        int ret = (max - 1) * (n + 1);
        for (int i = 0; i < 26; i++) {
            if (cnt[i] == max) {
                ret++;
            }
        }
        return Math.max(ret, tasks.length);
    }

}
