package com.aj.leetcode.q738;

/**
 * @author zhangqingyue
 * @date 2020/12/15
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.monotoneIncreasingDigits(12344);

    }

    public int monotoneIncreasingDigits(int N) {
        int ones = 111111111;
        int res = 0;

        for (int i = 0; i < 9; i++) {
            while (res + ones > N) {
                ones = ones / 10;
            }
            System.out.println("ones = " + ones + " res=  " + res);
            res += ones;
            if (res == 0) {
                break;
            }
        }
        return res;

    }


}
