package ink.czyhandsome;

/**
 * @author 曹子钰, 2022-03-06
 */
public class Question4 {

    public static int maxIncome(int[] prices) {
        int income = 0;
        // 假设 prices.length > 2
        boolean hasBuy = false;
        int now = prices[0];
        int boughtPrice = 0;
        int tempHighPrice = 0;
        for (int i = 1; i < prices.length; i++) {
            if (!hasBuy) {
                // 价格大于now, 可以买入了
                if (prices[i] > now) {
                    hasBuy = true;
                    boughtPrice = now;
                    tempHighPrice = prices[i];
                } else {
                    // 价格仍在下降, 不能买入
                    now = prices[i];
                }
            } else {
                // 价格开始跌了, 在前一天就可以抛出
                if (prices[i] < tempHighPrice) {
                    hasBuy = false;
                    income += (tempHighPrice - boughtPrice);
                    now = prices[i];
                } else {
                    // 价格仍在涨, 继续持有
                    tempHighPrice = prices[i];
                }
            }
        }
        return income;
    }

}
