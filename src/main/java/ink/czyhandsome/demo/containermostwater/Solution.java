package ink.czyhandsome.demo.containermostwater;

/**
 * Container with the most water
 *
 * @author zycao3, 2019/2/11
 */
public class Solution {
    public int maxArea(int[] height) {
        int p0 = 0;
        int p1 = height.length - 1;
        int result = area(height, p0, p1);
        while (p1 - p0 > 1) {
            if (height[p1] > height[p0]) {
                ++p0;
            } else {
                --p1;
            }
            result = Math.max(area(height, p0, p1), result);
        }
        return result;
    }

    private int area(int[] height, int p0, int p1) {
        return Math.min(height[p0], height[p1]) * (p1 - p0);
    }
}
