package FourHundredAndSeventyFour;

/**
 * 一和零
 *
 * @author zhousy
 * @date 2021-06-08  8:40
 */
public class Solution {

    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp = new int[strs.length + 1][m + 1][n + 1];
        dp[0][0][0] = 0;
        for (int i = 1; i <= strs.length; i++) {
            int[] cnt = countArr(strs[i - 1]);
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    dp[i][j][k] = dp[i - 1][j][k];
                    if (j >= cnt[0] && k >= cnt[1]){
                        dp[i][j][k] = Math.max(dp[i - 1][j][k], dp[i - 1][j - cnt[0]][k - cnt[1]] + 1);
                    }
                }
            }
        }
        return dp[strs.length][m][n];
    }

    //计算字符串中0、1的个数
    private int[] countArr(String str) {
        int[] cnt = new int[2];
        for (char c : str.toCharArray()) {
            cnt[c - '0']++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        String[] strs = {"10","0","1"};
        // 预期：4
        System.out.println(new Solution().findMaxForm(strs, 1, 1));
    }

}
