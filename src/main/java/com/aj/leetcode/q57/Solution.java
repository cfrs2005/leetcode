package com.aj.leetcode.q57;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangqingyue
 * @date 2020/11/4
 */
public class Solution {
    /**
     * know union  min(l1,l2) ,max(r1,r2)
     * know intersection max(l1,l2) ,min(r1,r2)
     *
     * @param intervals
     * @param newInterval
     * @return
     */
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int left = newInterval[0];
        int right = newInterval[1];
        boolean placed = false;
        List<int[]> ansList = new ArrayList<int[]>();
        for (int[] tmp : intervals) {
            if (left > tmp[1]) {
                ansList.add(tmp);
            } else if (right < tmp[0]) {
                if (!placed) {
                    ansList.add(new int[]{left, right});
                    placed = true;
                }
                ansList.add(tmp);
            } else {
                left = Math.min(tmp[0], left);
                right = Math.max(tmp[1], right);
            }

        }
        if (!placed) {
            ansList.add(new int[]{left, right});
        }

        int[][] ars = new int[ansList.size()][2];
        for (int i = 0; i < ansList.size(); i++) {
            ars[i] = ansList.get(i);
        }
        return ars;
    }

}
