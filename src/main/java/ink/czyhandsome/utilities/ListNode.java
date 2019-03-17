package ink.czyhandsome.utilities;

import java.util.LinkedList;
import java.util.List;

/**
 * 列表节点
 *
 * @author 曹子钰, 2019-03-16
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode of(int... nums) {
        ListNode result = null;
        ListNode point = null;
        for (int num : nums) {
            if (point == null) {
                result = new ListNode(num);
                point = result;
            } else {
                point.next = new ListNode(num);
                point = point.next;
            }
        }
        return result;
    }

    public List<Integer> toList() {
        List<Integer> result = new LinkedList<>();
        ListNode head = this;
        do {
            result.add(head.val);
            head = head.next;
        } while (head != null);
        return result;
    }
}
