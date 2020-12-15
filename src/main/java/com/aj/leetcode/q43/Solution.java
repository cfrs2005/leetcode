package com.aj.leetcode.q43;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author zhangqingyue
 * @date 2020/12/15
 */
public class Solution {

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int n = num1.length();
        int m = num2.length();
        int[] ansArr = new int[n + m];
        // get ans multiplication
        for (int i = n - 1; i > 0; i--) {
            int x = num1.charAt(i) - '0';
            for (int j = m - 1; j > 0; j--) {
                int y = num2.charAt(j) - '0';
                ansArr[i + j + 1] += x * y;
            }
        }
        // set ans addition
        for (int i = m + n - 1; i > 0; i--) {
            ansArr[i - 1] += ansArr[i] / 10;
            ansArr[i] = ansArr[i] % 10;
        }
        System.out.println(Arrays.toString(ansArr));
        StringBuffer ans = new StringBuffer();
        int index = ansArr[0] == 0 ? 1 : 0;
        while (index < m + n) {
            ans.append(ansArr[index]);
            index++;
        }
        return ans.toString();
    }

}
