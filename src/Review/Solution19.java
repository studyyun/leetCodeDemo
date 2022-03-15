package Review;

import java.util.Arrays;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-03-14  9:58
 */
public class Solution19 {
    
    //正向思路太绝了，不用判断边界；反向思路要判断边界值！
    public double[] dicesProbability(int n) {
        double[] dp = new double[6];
        Arrays.fill(dp, 1 / 6.0);
        for (int i = 2; i <= n; i++) {
            double[] res = new double[5 * i + 1];
            for (int j = 0; j < dp.length; j++) {
                for (int k = 0; k < 6; k++) {
                    res[j + k] += dp[j] * (1/6.0);
                }
            }
            dp = res;
        }
        return dp;
    }

    public static void main(String[] args) {
        new Solution19().dicesProbability(3);
    }
    
}
