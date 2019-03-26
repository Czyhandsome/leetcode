package ink.czyhandsome.demo.strstr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * $DESC
 *
 * @author 曹子钰, 2019-03-26
 */
class SolutionTest {

    @Test
    void strStr() {
        Solution solution = new Solution();
        assertEquals(0, solution.strStr("", ""));
        assertEquals(-1, solution.strStr("abc", "abcd"));
        assertEquals(0, solution.strStr("abc", "abc"));
        assertEquals(-1, solution.strStr("abcdefg", "aa"));
        assertEquals(1, solution.strStr("abbbcd", "bb"));
        assertEquals(1, solution.strStr("abcdefg", "bcdefg"));
    }

}
