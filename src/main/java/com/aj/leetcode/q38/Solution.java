package com.aj.leetcode.q38;

/**
 * @author zhangqingyue
 * @date 2020/11/4
 */
public class Solution {
    /**
     * @param n
     * @return
     */
    public String countAndSay(int n) {
        if (n <= 0) {
            return "";
        }
        String[] seq = new String[n];
        seq[0] = "1";
        for (int i = 1; i < n; i++) {
            seq[i] = convert(seq[i - 1]);
        }
        return seq[n - 1];
    }

    /**
     * @param str
     * @return
     */
    public String convert(String str) {
        StringBuilder ans = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                ans.append(count).append(str.charAt(i));
                count = 1;
            }
        }
        return new String(ans);
    }
}
