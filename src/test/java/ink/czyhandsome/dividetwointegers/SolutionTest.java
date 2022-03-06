package ink.czyhandsome.dividetwointegers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 曹子钰, 2022-03-06
 */
class SolutionTest {

    @Test
    public void test() {
        assertEquals(3, new Solution().divide(10, 3));
        assertEquals(-2, new Solution().divide(7, -3));
        assertEquals(-Integer.MAX_VALUE, new Solution().divide(Integer.MAX_VALUE, -1));
        assertEquals(Integer.MIN_VALUE, new Solution().divide(Integer.MIN_VALUE, 1));
        assertEquals(-Integer.MAX_VALUE, new Solution().divide(Integer.MIN_VALUE, -1));
        assertEquals(Integer.MAX_VALUE, new Solution().divide(Integer.MAX_VALUE, 1));
    }

}
