package ink.czyhandsome.demo.mergetwosortedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * 列表节点
 *
 * @author 曹子钰, 2019-03-16
 */
public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
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
