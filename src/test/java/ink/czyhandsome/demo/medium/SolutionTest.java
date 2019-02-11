package ink.czyhandsome.demo.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * DESC
 *
 * @author zycao3, 2019/2/11
 */
class SolutionTest {
    private static final Solution solution = new Solution();

    private static double calc(int[] nums1, int[] nums2) {
        return solution.findMedianSortedArrays(nums1, nums2);
    }

    private static int[] arr(int... nums) {
        return nums;
    }

    @Test
    void findMedianSortedArrays() {
        assertEquals(1, calc(arr(), arr(1)));
        assertEquals(1.5, calc(arr(), arr(1, 2)));
        assertEquals(2.5, calc(arr(1, 2), arr(3, 4)));
        assertEquals(1000001.5, calc(arr(1000001), arr(1000002)));
        assertEquals(100000.5, calc(arr(100001), arr(100000)));
        assertEquals(4.5, calc(arr(4), arr(1, 2, 3, 5, 6, 7, 8)));
        assertEquals(4.5, calc(arr(5), arr(1, 2, 3, 4, 6, 7, 8)));
    }
}
