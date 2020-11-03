package com.aj.leetcode.q941;

/**
 * @author zhangqingyue
 * @date 2020/11/3
 */
public class Solution {

    public void main(String[] args) {
        Solution solution = new Solution();
        int[] ab = {1, 3, 2};
        System.out.println(solution.validMountainArray(ab));
    }

    public boolean validMountainArray(int[] A) {
        int aLength = A.length;
        if (aLength <= 2) {
            return false;
        }
        int i = 0;
        while (i + 1 < aLength && A[i] < A[i + 1]) {
            i++;
        }
        if (i == 0 || i == aLength - 1) {
            return false;
        }
        while (i + 1 < aLength && A[i] > A[i + 1]) {
            i++;
        }
        return i == aLength - 1;
    }

}
