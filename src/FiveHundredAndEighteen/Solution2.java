package FiveHundredAndEighteen;

/**
 * 零钱兑换 II（完全背包问题）
 *
 * @author zhousy
 * @date 2021-06-10  8:49
 */
public class Solution2 {

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int j = 1; j <= amount; j++) {

            for (int coin : coins) {

                if (coin > j) {
                    dp[j] = dp[j];
                    continue;
                }

                dp[j] = dp[j] + dp[j - coin];

            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().change(5, new int[]{1, 2, 5}));
    }
}
