package ink.czyhandsome.demo.mergeklist;

import ink.czyhandsome.utilities.ListNode;

/**
 * Merge k lists - solution 2
 *
 * @author zycao3, 2019/3/17
 */
public class Solution2 {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;
        ListNode pointer = null;
        boolean finish;
        do {
            finish = true;
            Integer nextVal = null;
            Integer index = null;
            for (int i = 0; i < lists.length; i++) {
                ListNode list = lists[i];
                if (list != null) {
                    finish = false;
                    if (nextVal == null || list.val < nextVal) {
                        nextVal = list.val;
                        index = i;
                    }
                }
            }
            if (nextVal != null) {
                if (result == null) {
                    result = new ListNode(nextVal);
                    pointer = result;
                } else {
                    pointer.next = new ListNode(nextVal);
                    pointer = pointer.next;
                }
                lists[index] = lists[index].next;
            }
        } while (!finish);
        return result;
    }
}
