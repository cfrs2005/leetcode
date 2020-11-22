package com.aj.leetcode.q242;

/**
 * @author zhangqingyue
 * @date 2020/11/22
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
            chars[t.charAt(i) - 'a']--;
        }
        for (int item : chars) {
            if (item != 0) {
                return false;
            }
        }
        return true;
    }
}
