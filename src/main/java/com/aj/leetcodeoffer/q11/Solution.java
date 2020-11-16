package com.aj.leetcodeoffer.q11;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zhangqingyue
 * @date 2020/11/16
 */
public class Solution {
    //  3,4,5,1,2
    //  i=0 j=4 m=2

    public int minArray(int[] numbers) {
        int i = 0, j = numbers.length;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) {
                i = m + 1;
            } else if (numbers[m] < numbers[j]) {
                j = m;
            } else {
                j--;
            }
        }
        return numbers[i];
    }
}
