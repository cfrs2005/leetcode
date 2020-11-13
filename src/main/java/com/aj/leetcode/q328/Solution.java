package com.aj.leetcode.q328;

/**
 * @author zhangqingyue
 * @date 2020/11/13
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddDummy = new ListNode(-1);
        ListNode evenDummy = new ListNode(-1);
        ListNode odd = oddDummy;
        ListNode even = evenDummy;
        while (head != null) {

            // 1 2 3 4 5
            // odd.next 1
            // even.next 2
            // odd 1
            // even 2
            // odd 3
            // even 4


            odd.next = head;
            even.next = head.next;
            odd = head;
            even = even.next;
            ListNode next = null;
            if (head.next != null) {
                next = head.next.next;
            }
            head = next;
        }
        odd.next = evenDummy.next;
        return oddDummy.next;
    }
}
