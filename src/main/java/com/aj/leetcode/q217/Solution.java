package com.aj.leetcode.q217;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangqingyue
 * @date 2020/12/13
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                result = true;
                map.put(i, map.get(i) + 1);
                break;
            } else {
                map.put(i, 1);
            }
        }
        return result;
    }

}
