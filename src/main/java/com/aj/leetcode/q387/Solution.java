package com.aj.leetcode.q387;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangqingyue
 * @date 2020/12/23
 */
public class Solution {
    public int firstUniqChar(String s) {
        int n = s.toCharArray().length;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
