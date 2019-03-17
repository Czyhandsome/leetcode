package ink.czyhandsome.demo.mergeklist;

import ink.czyhandsome.utilities.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Merge k lists - based on PriorityQueue
 *
 * @author zycao3, 2019/3/17
 */
class Solution3 {

    ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val == o2.val) {
                    return 0;
                } else if (o1.val > o2.val) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for (ListNode list : lists) {
            if (list != null) {
                queue.add(list);
            }
        }
        while (!queue.isEmpty()) {
            ListNode min = queue.poll();
            tail.next = new ListNode(min.val);
            tail = tail.next;
            if (min.next != null) {
                queue.add(min.next);
            }
        }
        return dummy.next;
    }
}
