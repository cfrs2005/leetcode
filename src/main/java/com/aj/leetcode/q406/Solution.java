package com.aj.leetcode.q406;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zhangqingyue
 * @date 2020/11/16
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] result = solution.reconstructQueue(people);
        for (int[] c : result) {
//            System.out.println(Arrays.toString(c));
        }
    }

    public int[][] reconstructQueue(int[][] people) {
        // sort with high
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                } else {
                    return o2[1] - o1[1];
                }
            }
        });
        for (int[] c : people) {
            System.out.println(Arrays.toString(c));
        }
        int n = people.length;
        int[][] ans = new int[n][];
        // {4,4},{5,0},{5,2}
        for (int[] person : people) {
            int spaces = person[1] + 1;
            for (int i = 0; i < n; i++) {
                if (ans[i] == null) {
                    --spaces;
                    if (spaces == 0) {
                        ans[i] = person;
                        break;
                    }
                }
            }
        }
        return ans;
    }

}
