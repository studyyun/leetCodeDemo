package FourHundredAndSeventyFour;

/**
 * 一和零(优化)
 *
 * @author zhousy
 * @date 2021-06-08  8:40
 */
public class Solution2 {

    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        dp[0][0] = 0;
        for (String str : strs) {
            int[] cnt = countArr(str);
            for (int j = m; j >= 0; j--) {
                for (int k = n; k >= 0; k--) {
                    if (j >= cnt[0] && k >= cnt[1]) {
                        dp[j][k] = Math.max(dp[j][k], dp[j - cnt[0]][k - cnt[1]] + 1);
                    }
                }
            }
        }
        return dp[m][n];
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
        
        /*String[] strs = {"10", "0", "1"};
        // 预期：2
        System.out.println(new Solution2().findMaxForm(strs, 1, 1));*/

        String[] strs2 = {"10","0001","111001","1","0"};
        // 预期：4
        System.out.println(new Solution2().findMaxForm(strs2, 5, 3));
    }

}
