package com.aj.leetcode.q973;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zhangqingyue
 * @date 2020/11/9
 */
public class Solution {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // line= (o1[0]-0)*(o1[0]-0)+(o1[1]-0)*(o1[1]-0)
                return (o1[0] * o1[0] + o1[1] * o1[1] - o2[0] * o2[0] - o2[1] * o2[1]);
            }
        });
        return Arrays.copyOfRange(points, 0, K);
    }

}
