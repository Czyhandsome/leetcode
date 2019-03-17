package ink.czyhandsome.demo.mergetwosortedlist;

import ink.czyhandsome.utilities.ListNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

/**
 * Merge Two List Test
 *
 * @author 曹子钰, 2019-03-16
 */
class SolutionTest {

    @Test
    void mergeTwoLists() {
        Solution solution = new Solution();

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode result = solution.mergeTwoLists(l1, l2);
        assertThat(result.toList(), contains(1, 1, 2, 3, 4, 4));
    }
}
