package com.aj.leetcode.q452;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zhangqingyue
 * @date 2020/11/23
 */
public class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] point1, int[] point2) {
                if (point1[1] > point2[1]) {
                    return 1;
                } else if (point1[1] < point2[1]) {
                    return -1;
                }
                return 0;
            }
        });


        int pos = points[0][1];
        int ans = 1;
        // 1.6 2.8
        for (int[] balloon : points) {
            if (balloon[0] > pos) {
                pos = balloon[1];
                ++ans;
            }
        }
        return ans;
    }
}
