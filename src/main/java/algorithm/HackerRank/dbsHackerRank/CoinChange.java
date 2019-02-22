package algorithm.HackerRank.dbsHackerRank;

public class CoinChange {
    public static void main(String args[]) {
        int[] coins = new int[]{2, 5, 7};
        System.out.println("number of coin is " + doCoinChange(coins, 11));
    }

    public static int doCoinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i <= amount; i++) {
            for (int coin : coins) {
                if (i + coin <= amount) {
                    if (dp[i] == Integer.MAX_VALUE) {
                        dp[i + coin] = dp[i + coin];
                    } else {
                        dp[i + coin] = Math.min(dp[i + coin], dp[i] + 1);
                    }
                }
            }
        }

        if (dp[amount] == Integer.MAX_VALUE) return -1;
        return dp[amount];
    }
}
