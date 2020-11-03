package com.aj.leetcode.q349;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhangqingyue
 * @date 2020/11/2
 */
public class Solution {
    /**
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> hashSet1 = new HashSet();
        Set<Integer> hashSet2 = new HashSet();
        for (int i : nums1) {
            if (!hashSet1.contains(i)) {
                hashSet1.add(i);
            }
        }
        for (int i : nums2) {
            if (!hashSet2.contains(i)) {
                hashSet2.add(i);
            }
        }
        Set<Integer> tmp = new HashSet();
        if (hashSet1.size() >= hashSet2.size()) {
            tmp = hashSet1;
        } else {
            tmp = hashSet2;
            hashSet2 = hashSet1;
        }

        Set<Integer> intersectionSet = new HashSet<Integer>();
        for (int i : tmp) {
            if (hashSet2.contains(i)) {
                intersectionSet.add(i);
            }
        }

        int[] intersection = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            intersection[index++] = num;
        }
        return intersection;
    }
}
