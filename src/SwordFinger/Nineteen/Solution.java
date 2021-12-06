package SwordFinger.Nineteen;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-11-30  9:22
 */
public class Solution {

    //动态规划
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean[][] res = new boolean[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                //空正则
                if (j == 0) {
                    if (i == 0) {
                        res[i][j] = true;
                    }
                } else {
                    //非空正则
                    //最后一个字符是*
                    if (p.charAt(j - 1) == '*') {
                        if (j >= 2) {
                            res[i][j] = res[i][j - 2];
                        }
                        if (i >= 1 && j >= 2 && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.')) {
                            //重点，这里用或，两种情况：①
                            res[i][j] |= res[i - 1][j];
                        }
                    } else {
                        //最后一个字符不是*
                        if (i >= 1 && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.')) {
                            res[i][j] = res[i-1][j-1];
                        }
                    }
                }
            }
        }
        return res[n][m];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isMatch("aa", "a"));
        System.out.println(new Solution().isMatch("aa", "a*"));
        System.out.println(new Solution().isMatch("ab", ".*"));
        System.out.println(new Solution().isMatch("aab", "c*a*b"));
        System.out.println(new Solution().isMatch("mississippi", "mis*is*p*."));
        System.out.println(new Solution().isMatch("mississippi", "mis*is*ip*."));
        System.out.println(new Solution().isMatch("ab", ".*c"));
    }

}
