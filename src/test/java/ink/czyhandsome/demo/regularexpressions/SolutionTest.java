package ink.czyhandsome.demo.regularexpressions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * DESC
 *
 * @author zycao3, 2019/2/11
 */
class SolutionTest {

    private static final Solution solution = new Solution();

    private static boolean isM(String s, String p) {
        return solution.isMatch(s, p);
    }

    @Test
    void isMatch() {
        assertTrue(!isM("aa", "a"));
        assertTrue(isM("aa", "a*"));
        assertTrue(isM("ab", ".*"));
        assertTrue(isM("aab", "c*a*b"));
        assertTrue(!isM("mississippi", "mis*is*p*"));
        assertTrue(isM("aaa", "ab*ac*a"));
        assertTrue(!isM("a", ".*..a"));
        assertTrue(isM("aaa", "ab*a*c*a"));
        assertTrue(isM("aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*a*a*b"));
    }
}
