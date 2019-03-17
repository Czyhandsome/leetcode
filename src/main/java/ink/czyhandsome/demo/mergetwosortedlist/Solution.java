package ink.czyhandsome.demo.mergetwosortedlist;

//@formatter:off

import ink.czyhandsome.utilities.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//@formatter:on
class Solution {
    ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode h1 = l1;
        ListNode h2 = l2;
        ListNode result = null;
        ListNode point = null;
        while (h1 != null || h2 != null) {
            int nextVal;
            if (h2 == null || h1 != null && h1.val < h2.val) {
                nextVal = h1.val;
                h1 = h1.next;
            } else {
                nextVal = h2.val;
                h2 = h2.next;
            }
            if (point == null) {
                result = new ListNode(nextVal);
                point = result;
            } else {
                point.next = new ListNode(nextVal);
                point = point.next;
            }
        }
        return result;
    }
}
