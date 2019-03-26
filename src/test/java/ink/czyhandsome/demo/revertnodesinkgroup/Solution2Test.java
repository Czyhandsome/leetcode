package ink.czyhandsome.demo.revertnodesinkgroup;

import ink.czyhandsome.utilities.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * $DESC
 *
 * @author 曹子钰, 2019-03-20
 */
class Solution2Test {

    @Test
    void reverseKGroup() {
        Solution2 solution = new Solution2();
        assertNull(solution.reverseKGroup(null, 2));
        assertEquals(Arrays.asList(1, 2, 3), solution.reverseKGroup(ListNode.of(1, 2, 3), 4).toList());
        assertEquals(Arrays.asList(3, 2, 1, 4, 5), solution.reverseKGroup(ListNode.of(1, 2, 3, 4, 5), 3).toList());
        assertEquals(Arrays.asList(3, 2, 1, 6, 5, 4),
                solution.reverseKGroup(ListNode.of(1, 2, 3, 4, 5, 6), 3).toList());
        assertEquals(Arrays.asList(3, 2, 1, 6, 5, 4, 7),
                solution.reverseKGroup(ListNode.of(1, 2, 3, 4, 5, 6, 7), 3).toList());
    }
}
