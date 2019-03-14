package ink.czyhandsome.demo.threesums;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 找到所有的不重复三元组, 且元素之和为0
 *
 * @author 曹子钰, 2019-03-13
 */
class SolutionTest {

    @Test
    void threeSum() {
        List<List<Integer>> actual = new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, 4});
        assertThat(actual, containsInAnyOrder(Arrays.asList(-1, 0, 1), Arrays.asList(-1, -1, 2)));

        int[] hugeZero = new int[10000];
        for (int i : hugeZero) {
            hugeZero[i] = 0;
        }
        actual = new Solution().threeSum(hugeZero);
        assertEquals(actual, Collections.singletonList(Arrays.asList(0, 0, 0)));
    }
}
