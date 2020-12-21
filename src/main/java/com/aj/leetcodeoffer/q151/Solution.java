package com.aj.leetcodeoffer.q151;

/**
 * @author zhangqingyue
 * @date 2020/12/21
 */
public class Solution {
    /**
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        String[] list = s.trim().split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = list.length - 1; i >= 0; i--) {
            if (!list[i].equals("")) {
                stringBuffer.append(list[i] + " ");
            }
        }
        return stringBuffer.toString().trim();
    }
}