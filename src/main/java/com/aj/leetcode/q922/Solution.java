package com.aj.leetcode.q922;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangqingyue
 * @date 2020/11/12
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] x = {3, 4, 5, 2};
        System.out.println(Arrays.toString(solution.sortArrayByParityII(x)));
    }

    public int[] sortArrayByParityII(int[] A) {
        int[] ans = new int[A.length];
        int i = 0;
        for (int x : A) {
            if (x % 2 == 0) {
                ans[i] = x;
                i += 2;
            }
        }
        i = 1;
        for (int x : A) {
            if (x % 2 == 1) {
                ans[i] = x;
                i += 2;
            }
        }
        return ans;
    }
}
