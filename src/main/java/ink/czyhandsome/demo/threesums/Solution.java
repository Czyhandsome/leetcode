package ink.czyhandsome.demo.threesums;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 找到所有的不重复三元组, 且元素之和为0
 */
class Solution {
    List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int lo = i + 1;
                int hi = nums.length - 1;
                while (lo < hi) {
                    if (nums[lo] + nums[hi] + nums[i] == 0) {
                        result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo + 1]) ++lo;
                        while (lo < hi && nums[hi] == nums[hi - 1]) --hi;
                        ++lo;
                        --hi;
                    } else if (nums[hi] + nums[lo] + nums[i] < 0) ++lo;
                    else --hi;
                }
            }
        }
        return result;
    }
}
