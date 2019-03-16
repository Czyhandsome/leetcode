package ink.czyhandsome.demo.validparentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Valid Parentheses Test
 *
 * @author 曹子钰, 2019-03-16
 */
class SolutionTest {

    @Test
    void isValid() {
        Solution solution = new Solution();

        assertTrue(solution.isValid(""));
        assertTrue(solution.isValid("{}"));
        assertTrue(solution.isValid("{}"));
        assertTrue(solution.isValid("{}()[]"));
        assertFalse(solution.isValid("{)"));
        assertTrue(solution.isValid("[({})]"));
        assertFalse(solution.isValid("[{}(])"));
    }
}
