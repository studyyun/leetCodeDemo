package FiveHundredAndEighteen;

/**
 * 零钱兑换 II（完全背包问题）
 *
 * @author zhousy
 * @date 2021-06-10  8:49
 */
public class Solution {

    public int change(int amount, int[] coins) {
        int length = coins.length + 1;
        int[][] dp = new int[length][amount + 1];

        for (int i = 0; i < length; i++) {
            dp[i][0] = 1;
        }

        for (int j = 1; j <= amount; j++) {

            for (int i = 1; i <= coins.length; i++) {

                
                if (coins[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                    continue;
                }
                
                dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]];
                
            }
            
        }
        return dp[coins.length][amount];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().change(5, new int[]{1, 2, 5}));
    }
}
