package com.aj.leetcode.q58;

/**
 * https://leetcode-cn.com/problems/length-of-last-word/
 *
 * @author zhangqingyue
 * @date 2020/11/2
 */
public class Solution {

    /**
     * get chart end without space
     * set chart start from end
     * get end => space  =start
     * get end->start
     *
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        if (end < 0) {
            return 0;
        }
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;
    }

}
