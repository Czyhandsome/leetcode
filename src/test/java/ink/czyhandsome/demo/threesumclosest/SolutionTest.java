package ink.czyhandsome.demo.threesumclosest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * $DESC
 *
 * @author 曹子钰, 2019-03-14
 */
class SolutionTest {

    @Test
    void threeSumClosest() {
        assertEquals(2, new Solution().threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        assertEquals(-2, new Solution().threeSumClosest(new int[]{-3, -2, -5, 3, -4}, -1));
        assertEquals(0, new Solution().threeSumClosest(new int[]{0, 2, 1, -3}, 1));
    }
}
