package SwordFinger.Fourteen.I;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-22  9:20
 */
public class Solution {

    public int cuttingRope(int n) {
        if (n == 2){
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[2] = 1;
        dp[3] = 2;
        for (int i = 4; i <= n; i++) {

            for (int j = 2; j <= i - 2; j++) {

                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i-j]));

            }

        }
        
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().cuttingRope(10));
    }
}
