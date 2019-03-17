package ink.czyhandsome.demo.threesumclosest;

import java.util.Arrays;

/**
 * 3sum 最接近的值
 */
class Solution {
    int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        int delta = Math.abs(result - target);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int lo = i + 1;
                int hi = nums.length - 1;
                while (lo < hi) {
                    int r = nums[i] + nums[lo] + nums[hi];
                    int d = Math.abs(r - target);
                    if (d == 0) {
                        return target;
                    }
                    // 判断delta是否减少
                    else if (d < delta) {
                        // 计算新的delta与result
                        result = r;
                        delta = Math.abs(r - target);
                        while (lo < hi && nums[hi] == nums[hi - 1]) --hi;
                        while (lo < hi && nums[lo] == nums[lo + 1]) ++lo;
                    } else if (r >= target + delta) {
                        --hi;
                    } else {
                        ++lo;
                    }
                }
            }
        }
        return result;
    }
}
