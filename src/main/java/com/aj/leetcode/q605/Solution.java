package com.aj.leetcode.q605;

/**
 * @author zhangqingyue
 * @date 2021/1/1
 */
public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                n--;
                if (n == 0) {
                    return true;
                }
                flowerbed[i] = 1;
            }
        }

        return n <= 0;
    }

}
