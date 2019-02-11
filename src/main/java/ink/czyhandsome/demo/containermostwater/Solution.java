package ink.czyhandsome.demo.containermostwater;

/**
 * Container with the most water
 *
 * @author zycao3, 2019/2/11
 */
public class Solution {
    public int maxArea(int[] height) {
        int result = -1;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int current = (j - i) * Math.min(height[i], height[j]);
                if (current > result) {
                    result = current;
                }
            }
        }
        return result;
    }
}
