package ink.czyhandsome.demo.mergeklist;

import ink.czyhandsome.utilities.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Merge K Lists Test
 *
 * @author zycao3, 2019/3/17
 */
class SolutionTest {

    @Test
    void mergeKLists() {
        Solution solution = new Solution();
        assertEquals(
                Arrays.asList(1, 1, 2, 3, 4, 4, 5, 6),
                solution.mergeKLists(new ListNode[]{ListNode.of(1, 4, 5), ListNode.of(1, 3, 4), ListNode.of(2, 6)})
                        .toList()
        );
    }
}