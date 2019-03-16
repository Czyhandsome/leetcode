package ink.czyhandsome.demo.foursum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

/**
 * 4 sum test
 *
 * @author 曹子钰, 2019-03-16
 */
class SolutionTest {

    @Test
    void fourSum() {
        assertThat(new Solution().fourSum(new int[]{1, 2, 3, 4}, 10), containsInAnyOrder(Arrays.asList(1, 2, 3, 4)));
    }
}
