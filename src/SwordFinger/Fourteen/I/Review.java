package SwordFinger.Fourteen.I;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-16  9:29
 */
public class Review {

    // https://leetcode.cn/problems/jian-sheng-zi-lcof/solution/jian-zhi-offer-by-leetcode_xsong-yrqo/
    public int cuttingRope(int n) {
        //dep[n]  长度为n的最大乘积
        int[] dep = new int[n + 1];
        //题目要求至少切割两段绳子，并且由于动态转移方程需要初始值，所以赋值dep[2] = 1
        dep[2] = 1;
        for (int i = 3; i <= n; i++) {
            //i = 7 , j = 2,dp[7] = max(dp[7], 2*5, 2*dp[5]);
            //i = 7 , j = 5,dp[7] = max(dp[7], 5*2, 5*dp[2]);
            //又因为：dp[5] = max(dp[5], 3*2, 3*dp[2]) 可以得出 dp[5] >= 3*dp[2] 的，带入上面第一条得出
            //i = 7 , j = 2,dp[7] = max(dp[7], 2*5, 6*dp[2]); 所以 j = 2 一定大于或者等于 j = 5 的情况
            //同理可推出其他的所有情况，因此我们可以把 j 优化为 j <= i / 2 ,后半部分的情况不用考虑
            for (int j = 1; j <= i / 2; j++) {
                // 之前轮次绳子长为i的最大乘积，切割j长度剩下的绳子不进行切分，切割j长度剩下的绳子进行切分
                dep[i] = Math.max(dep[i], Math.max(j * (i - j), j * dep[i - j]));
            }

        }
        return dep[n];
    }

}
