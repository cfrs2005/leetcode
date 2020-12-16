package com.aj.leetcode.q290;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangqingyue
 * @date 2020/12/16
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.wordPattern("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd",
                "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t");
        System.out.println(result);
    }

    /**
     * @param pattern
     * @param s
     * @return
     */
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        if (pattern.length() != strs.length) {
            System.out.println("length not enough");
            return false;
        }
        Map map = new HashMap<>();
        for (Integer i = 0; i < pattern.length(); i++) {
            if (map.put(pattern.charAt(i), i) != map.put(strs[i], i)) {
                System.out.println(map.put(pattern.charAt(i), i) == (map.put(strs[i], i)));
                return false;
            }
        }
        return true;
    }

}
