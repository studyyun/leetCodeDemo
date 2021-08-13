package SwordFinger.FortyNine;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-08-13  9:48
 */
public class Solution {

    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        //  三指针
        //  nums2 = {1*2, 2*2, 3*2, 4*2, 5*2, 6*2, 8*2...}
        //  nums3 = {1*3, 2*3, 3*3, 4*3, 5*3, 6*3, 8*3...}
        //  nums5 = {1*5, 2*5, 3*5, 4*5, 5*5, 6*5, 8*5...}
        //  实际上就是对上述三个序列进行排序，并且还要去重，使用三个if就是去重
        int p2 = 0, p3 = 0, p5 = 0;
        for (int i = 1; i < dp.length; i++) {

            dp[i] = Math.min(Math.min(dp[p2] * 2, dp[p3] * 3), dp[p5] * 5);
            if (dp[i] == dp[p2] * 2) {
                p2++;
            }
            if (dp[i] == dp[p3] * 3) {
                p3++;
            }
            if (dp[i] == dp[p5] * 5) {
                p5++;
            }

        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        new Solution().nthUglyNumber(10);
    }

}
