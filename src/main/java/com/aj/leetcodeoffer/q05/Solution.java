package com.aj.leetcodeoffer.q05;

/**
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 *
 * @author zhangqingyue
 * @date 2020/11/11
 */
public class Solution {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.replaceSpace(new String("hello world is good"));
        System.out.println(result);
    }

    /**
     * @param s
     * @return
     */
    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder(s.length() * 3);
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

}
