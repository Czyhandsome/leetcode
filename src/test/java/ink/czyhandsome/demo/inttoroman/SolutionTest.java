package ink.czyhandsome.demo.inttoroman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * DESC
 *
 * @author zycao3, 2019/2/12
 */
class SolutionTest {
    private Solution solution = new Solution();

    private String t(int num) {
        return solution.intToRoman(num);
    }

    @Test
    void intToRoman() {
        assertEquals("IV", t(4));
        assertEquals("IX", t(9));
        assertEquals("LVIII", t(58));
        assertEquals("LXIII", t(63));
        assertEquals("MX", t(1010));
        assertEquals("MCMXCIV", t(1994));
        assertEquals("MMMCMXCIX", t(3999));
    }
}
