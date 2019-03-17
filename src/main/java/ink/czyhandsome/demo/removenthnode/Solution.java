package ink.czyhandsome.demo.removenthnode;

import ink.czyhandsome.utilities.ListNode;

/**
 * Remove Nth Node From End of List
 *
 * @author 曹子钰, 2019-03-16
 */
class Solution {

    ListNode removeNthFromEnd(ListNode head, int n) {
        int d = 0;
        ListNode h = head;
        ListNode l = head;
        while (l.next != null) {
            l = l.next;
            if (d < n) {
                ++d;
            } else {
                h = h.next;
            }
        }
        if (d < n - 1) {
            return head;
        } else if (d == n - 1) {
            return head.next;
        } else {
            ListNode deleted = h.next;
            h.next = deleted.next;
            deleted.next = null;
            return head;
        }
    }

}
