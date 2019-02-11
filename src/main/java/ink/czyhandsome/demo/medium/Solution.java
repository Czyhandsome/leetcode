package ink.czyhandsome.demo.medium;

/**
 * Medium of two sorted arrays
 *
 * @author zycao3, 2019/2/5
 */
public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums2.length < nums1.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        if (nums1.length == 0) {
            return median(nums2);
        }
        int total = nums1.length + nums2.length;
        int half = total / 2;
        int big = nums1.length;
        int small = 0;
        int pivot = nums1.length / 2;
        while (true) {
            int pivot2 = half - pivot;
            int ns1 = pivot > 0 ? nums1[pivot - 1] : nums2[pivot2 - 1];
            int nb1 = pivot < nums1.length ? nums1[pivot] : nums2[pivot2];
            int ns2 = pivot2 > 0 ? nums2[pivot2 - 1] : nums1[pivot - 1];
            int nb2 = pivot2 < nums2.length ? nums2[pivot2] : nums1[pivot];
            if (nb1 >= ns2 && nb2 >= ns1) {
                if (total % 2 == 1) {
                    return Math.min(nb1, nb2);
                } else {
                    return (Math.min(nb1, nb2) + Math.max(ns1, ns2)) / 2.0;
                }
            }
            if (nb1 < ns2) {
                small = pivot;
                pivot = (pivot + big + 1) / 2;
            } else {
                big = pivot;
                pivot = (small + pivot) / 2;
            }
        }
    }

    private double median(int[] nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException();
        }
        if (nums.length % 2 == 0) {
            return (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2.0;
        } else {
            return nums[nums.length / 2];
        }
    }
}
