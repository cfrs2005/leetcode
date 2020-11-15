package com.aj.leetcode.q1122;

import java.util.ArrayList;

/**
 * @author zhangqingyue
 * @date 2020/11/14
 */
public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] save = new int[1001];
        for (int i : arr1) {
            save[i]++;
        }
        int j = 0;

        for (int i = 0; i < arr2.length; i++) {
            int cur = arr2[i];
            while (save[cur] > 0) {
                arr1[j] = cur;
                save[cur]--;
                j++;
            }
        }
        if (j < arr1.length) {
            for (int i = 0; i < 1001; i++) {
                while (save[i] > 0) {
                    arr1[j] = i;
                    save[i]--;
                    j++;
                }
            }
        }
        return arr1;
    }

}
