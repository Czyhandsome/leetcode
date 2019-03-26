package ink.czyhandsome.demo.revertnodesinkgroup;

import ink.czyhandsome.utilities.ListNode;

/**
 * Revert k-node group
 *
 * @author 曹子钰, 2019-03-22
 */
class Solution {

    ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode h = dummy;
        while (h != null) {
            ListNode lo = h;
            for (int i = 0; i < k; i++) {
                lo = lo.next;
                if (lo == null) {
                    break;
                }
            }
            if (lo == null) {
                break;
            }
            h = doRevert(h, lo.next);
        }
        return dummy.next;
    }

    private ListNode doRevert(ListNode hi, ListNode lo) {
        ListNode f = hi.next;
        ListNode p = f;
        ListNode l = p.next;
        ListNode ln = l.next;
        while (true) {
            l.next = p;
            p = l;
            if (ln == lo) {
                break;
            } else {
                l = ln;
                ln = ln.next;
            }
        }
        hi.next = l;
        f.next = lo;
        return f;
    }

}
