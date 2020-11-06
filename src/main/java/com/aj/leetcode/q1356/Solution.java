package com.aj.leetcode.q1356;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author zhangqingyue
 * @date 2020/11/6
 */
public class Solution {
    public int[] sortByBits(int[] arr) {
        int[] bit = new int[arr.length];
        List<Integer> list = new ArrayList<Integer>();
        for (int x : arr) {
            list.add(x);
            bit[x] = get(x);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (bit[o1] != bit[o2]) {
                    return bit[o1] - bit[o2];
                } else {
                    return o1 - o2;
                }
            }
        });
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = list.get(i);
        }
        return arr;

    }

    public int get(int x) {
        int res = 0;
        while (x != 0) {
            res += x % 2;
            x /= 2;
        }
        return res;
    }
}
