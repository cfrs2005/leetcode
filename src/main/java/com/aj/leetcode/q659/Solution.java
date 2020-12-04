package com.aj.leetcode.q659;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangqingyue
 * @date 2020/12/4
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ab = new int[]{1, 2, 3, 3, 4, 5};
        System.out.println(solution.isPossible(ab));
    }

    public boolean isPossible(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        boolean result = false;
        try {
            map.forEach((key, value) -> {
                System.out.print("key 为\t" + key);
                if (ans.size() == 0) {
                    ans.add(key);
                } else {
                    if (map.containsKey(key - 1)) {
                        ans.add(key);
                    } else {
                        if (ans.size() >= 3) {
                            throw new RuntimeException();
                        }
                    }
                }
                System.out.println("\t长度为\t" + ans.size());
            });
        } catch (Exception e) {
            result = true;
        }
        if(ans.size()>3){
            result = true;
        }

        return result;
    }
}
