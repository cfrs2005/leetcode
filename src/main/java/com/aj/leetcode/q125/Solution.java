package com.aj.leetcode.q125;

/**
 * @author zhangqingyue
 * @date 2020/11/9
 */
public class Solution {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(new String("A man, a plan, a canal: Panama"));
        System.out.println(result);
    }

    /**
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        // string buffer  thread safety
        // string Builder thread un
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // check is number or char
            if (Character.isLetterOrDigit(ch)) {
                stringBuilder.append(Character.toLowerCase(ch));
            }
        }
        StringBuilder stringBuilder1 = new StringBuilder(stringBuilder).reverse();
        System.out.println(stringBuilder1);
        return stringBuilder.toString().equals(stringBuilder1.toString());
    }
}
