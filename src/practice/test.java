package practice;

public class test {
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4, 0, 7};
        int maxProfit = maxProfit(prices);
        System.out.print(maxProfit);
    }

    public static int maxProfit(int prices[]) {
        int lo = Integer.MAX_VALUE;
        int hi = Integer.MIN_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++) {
            if (prices[i] < lo) {
                lo = prices[i];
                hi = Integer.MIN_VALUE;
            }
            else if (prices[i] > hi) {
                hi = prices[i];
                maxProfit = Math.max(maxProfit, hi - lo);
            }
        }
        return maxProfit;
    }
}
