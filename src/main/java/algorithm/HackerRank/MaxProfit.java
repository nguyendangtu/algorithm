package algorithm.HackerRank;

public class MaxProfit {

    public static void main(String args[]) {
        //int[] prices0 = new int[]{7, 6, 4, 3, 1};
        //System.out.println(maxProfit(prices0));
        int[] prices = new int[]{3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        return maxProfit(0, 0, prices);

    }


    public static int maxProfit(int maxProfit, int start, int[] prices) {
        int index = start, trackingIndex = start;
        while (index < prices.length - 1 && trackingIndex < prices.length) {
            if (prices[index] >= prices[index + 1]) {
                index++;
            }
            trackingIndex++;
        }
        if (index >= prices.length - 1) {
            return maxProfit;
        }

        int min = prices[index];
        int max = prices[index + 1];
        int maxIndex = index + 1;
        for (int i = index + 1; i < prices.length; i++) {
            if (prices[i] >= max) {
                max = prices[i];
                maxIndex = i;
            }
        }
        for (int i = index; i < maxIndex; i++) {
            if (prices[i] <= min) {
                min = prices[i];
            }
        }

        int distance = max - min;
        if (maxProfit >= distance) {
            return maxProfit;
        }

        return maxProfit(max - min, maxIndex + 1, prices);
    }


}
