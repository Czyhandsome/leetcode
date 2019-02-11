package ink.czyhandsome.demo.containermostwater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * DESC
 *
 * @author zycao3, 2019/2/11
 */
class SolutionTest {
    private static final Solution SOLUTION = new Solution();

    private static int m(int... height) {
        return SOLUTION.maxArea(height);
    }

    @Test
    void maxArea() {
        assertEquals(49, m(1, 8, 6, 2, 5, 4, 8, 3, 7));
    }
}
