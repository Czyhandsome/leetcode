package ink.czyhandsome.dividetwointegers;

class Solution {

    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (dividend > 0 && divisor > 0) {
            int result = 1;
            while (result < Integer.MAX_VALUE && dividend > divisor) {
                dividend -= divisor;
                ++result;
            }
            return result;
        } else if (dividend > 0 && divisor < 0) {
            // TODO: 实现这个方法
            throw new RuntimeException("尚未实现这个方法!");
        } else if (dividend < 0 && divisor < 0) {
// TODO: 实现这个方法
            throw new RuntimeException("尚未实现这个方法!");
        }
        // TODO: 实现这个方法
        throw new RuntimeException("尚未实现这个方法!");
    }

}
