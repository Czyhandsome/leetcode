package ink.czyhandsome.demo.romantoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 罗马数字转整数测试
 *
 * @author 曹子钰, 2019-03-13
 */
class SolutionTest {

    @Test
    void romanToInt() {
        assertEquals(58, new Solution().romanToInt("LVIII"));
    }
}
