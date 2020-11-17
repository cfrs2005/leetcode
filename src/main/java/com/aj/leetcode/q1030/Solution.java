package com.aj.leetcode.q1030;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zhangqingyue
 * @date 2020/11/17
 */
public class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] ret = new int[R * C][];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                ret[i * C + j] = new int[]{i, j};
            }
        }

        Arrays.sort(ret, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (Math.abs(o1[0] - r0) + Math.abs(o1[1] - c0)) -
                        (Math.abs(o2[0] - r0) + Math.abs(o2[1] - c0));
            }
        });
        return ret;
    }

}
