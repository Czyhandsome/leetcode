package ink.czyhandsome.demo.foursum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 4 sum
 */
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> results = new LinkedList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j < nums.length - 2; j++)
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        int sum2 = target - nums[i] - nums[j];
                        int lo = j + 1;
                        int hi = nums.length - 1;
                        while (lo < hi) {
                            if (nums[lo] + nums[hi] == sum2) {
                                results.add(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]));
                                while (lo < hi && nums[lo] == nums[lo + 1]) ++lo;
                                while (lo < hi && nums[hi] == nums[hi - 1]) --hi;
                                --hi;
                                ++lo;
                            } else if (nums[lo] + nums[hi] > sum2) --hi;
                            else ++lo;
                        }
                    }
            }
        }
        return results;
    }
}
