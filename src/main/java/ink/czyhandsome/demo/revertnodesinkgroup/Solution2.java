package ink.czyhandsome.demo.revertnodesinkgroup;

import ink.czyhandsome.utilities.ListNode;

import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution2 {
    ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode h = dummy;
        boolean isFinish = false;
        Stack<ListNode> stack = new Stack<>();
        while (!isFinish) {
            ListNode next = h.next;
            for (int i = 0; i < k; i++) {
                if (next == null) {
                    isFinish = true;
                    break;
                } else {
                    stack.push(next);
                    next = next.next;
                }
            }
            if (!isFinish) {
                ListNode current = h;
                while (!stack.isEmpty()) {
                    current.next = stack.pop();
                    current = current.next;
                }
                h = current;
                h.next = next;
            }
        }
        return dummy.next;
    }
}
