package ink.czyhandsome.demo.mergeklist;

import ink.czyhandsome.utilities.ListNode;

import java.util.Arrays;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        List<ListNode> nodes = Arrays.asList(lists);
        return mergeKLists(nodes);
    }

    private ListNode mergeKLists(List<ListNode> nodes) {
        if (nodes.size() == 1) {
            return nodes.get(0);
        } else if (nodes.size() == 2) {
            return merge2Lists(nodes.get(0), nodes.get(1));
        } else {
            return merge2Lists(
                    mergeKLists(nodes.subList(0, nodes.size() / 2)),
                    mergeKLists(nodes.subList(nodes.size() / 2, nodes.size()))
            );
        }
    }

    private ListNode merge2Lists(ListNode l1, ListNode l2) {
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