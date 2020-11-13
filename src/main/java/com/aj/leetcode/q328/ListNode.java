package com.aj.leetcode.q328;

/**
 * @author zhangqingyue
 * @date 2020/11/13
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode node) {
        this.val = val;
        this.next = node;
    }
}
