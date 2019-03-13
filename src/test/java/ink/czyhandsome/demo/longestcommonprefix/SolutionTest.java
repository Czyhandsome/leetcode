package ink.czyhandsome.demo.longestcommonprefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 最长的共通前缀测试
 *
 * @author 曹子钰, 2019-03-13
 */
class SolutionTest {

    @Test
    void longestCommonPrefix() {
        assertEquals("", new Solution().longestCommonPrefix(new String[]{}));
        assertEquals("fl", new Solution().longestCommonPrefix(new String[]{"flower", "flow", "flip"}));
    }
}
