package SwordFinger.Ten.I;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-21  8:41
 */
public class Solution {

    public int fib(int n) {
        /*if (n == 0){
            return 0;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
        }
        return dp[n];*/
        if ( n == 0){
            return 0;
        }
        int a=0,b=1,sum=0;

        for (int i = 2; i <= n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return b;
    }
    
}
