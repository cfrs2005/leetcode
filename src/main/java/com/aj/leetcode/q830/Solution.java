package com.aj.leetcode.q830;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangqingyue
 * @date 2021/1/5
 */
public class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        int n = s.length();
        int num = 1;
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || s.charAt(i) != s.charAt(i + 1)) {
                if (num >= 3) {
                    lists.add(Arrays.asList(i - num + 1, i));
                }
                num = 1;
            } else {
                num++;
            }
        }
        return lists;
    }
}
