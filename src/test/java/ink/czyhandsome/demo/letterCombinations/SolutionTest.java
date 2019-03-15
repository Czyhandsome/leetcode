package ink.czyhandsome.demo.letterCombinations;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

/**
 * 电话号码可能的组合测试
 *
 * @author 曹子钰, 2019-03-15
 */
class SolutionTest {

    @Test
    void letterCombinations() {
        assertThat(new Solution().letterCombinations("23"), containsInAnyOrder("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
    }
}
