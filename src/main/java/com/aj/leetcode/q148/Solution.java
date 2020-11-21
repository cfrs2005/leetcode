package com.aj.leetcode.q148;

/**
 * @author zhangqingyue
 * @date 2020/11/21
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(6);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(1);
        ListNode h = new ListNode(8);
        ListNode i = new ListNode(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = h;
        h.next = i;
        i.next = null;
        ListNode res = solution.sortList(a);
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.val);
        System.out.println(fast.val);
        // mid
        ListNode tmp = slow.next;
        slow.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(tmp);

        ListNode h = new ListNode(0);
        ListNode res = h;
        while (left != null && right != null) {
            if (left.val < right.val) {
                h.next = left;
                left = left.next;
            } else {
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }
        h.next = left != null ? left : right;
        return res.next;
    }
}
