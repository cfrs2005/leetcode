package com.aj.leetcode.q389;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangqingyue
 * @date 2020/12/18
 */
public class Solution {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findTheDifference("asd", "asdc"));
    }

    /**
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {
        if (t.length() == 1) {
            return t.charAt(0);
        }
        int[] cnt = new int[26];
        for (char ch : s.toCharArray()) {
            cnt[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            cnt[ch - 'a']--;
            if (cnt[ch - 'a'] < 0) {
                return ch;
            }
        }
        return ' ';
    }
}
