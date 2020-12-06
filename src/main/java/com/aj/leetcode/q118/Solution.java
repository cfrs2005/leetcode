package com.aj.leetcode.q118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangqingyue
 * @date 2020/12/6
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.generate(5);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            System.out.println(i);
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    System.out.println("i " + i + " j " + j);
                    row.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
                }
            }
            res.add(row);
            for (Integer info : row) {
                System.out.print(info);
            }
            System.out.println("");
        }
        return res;
    }
}
