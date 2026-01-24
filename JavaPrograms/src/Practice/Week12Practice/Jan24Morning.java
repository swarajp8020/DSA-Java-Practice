package Practice.Week12Practice;

public class Jan24Morning {

    /// BestTimeToBuyAndSellStock
    public static int maxProfit(int[] prices) {
        int minPrices = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int p:prices) {
            minPrices = Math.min(minPrices, p);
            maxProfit = Math.max(maxProfit, p - minPrices);
        }
        return maxProfit;
    }
    static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
