package algorithm.HackerRank;

/***
 * You are given coins of different denominations and a total amount of money amount. Write a function to
 * compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be
 * made up by any combination of the coins, return -1.
 *
 * Example 1:
 *
 * Input: coins = [1, 2, 5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 * Example 2:
 *
 * Input: coins = [2], amount = 3
 * Output: -1
 * Note:
 * You may assume that you have an infinite number of each kind of coin.
 */
public class CoinChange {
    public static void main(String args[]) {
        int[] coins = new int[]{1, 2,3,4,5};
        System.out.println("number of coin is " + doCoinChange(coins, 8));
    }



    public static int doCoinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int dp[] = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i <= amount; i++) {
            for (int coin : coins) {
                if (i + coin <= amount) {
                    if (dp[i] < Integer.MAX_VALUE) {
                        dp[i + coin] = Math.min(dp[i + coin], dp[i] + 1);
                    }
                }
            }
        }

        if (dp[amount] == Integer.MAX_VALUE) return -1;
        return dp[amount];
    }
}
