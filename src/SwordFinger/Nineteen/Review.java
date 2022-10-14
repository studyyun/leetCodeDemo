package SwordFinger.Nineteen;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-22  10:33
 */
public class Review {

    //动态规划
    public boolean isMatch(String s, String p) {

        int m = s.length(), n = p.length();
        boolean[][] res = new boolean[m + 1][n + 1];
        res[0][0] = true;
        for (int i = 1; i < n; i = i + 2) {
            res[0][i + 1] = res[0][i - 1] && p.charAt(i) == '*';
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (p.charAt(j - 1) == '*') {
                    if (res[i][j - 2]) {
                        res[i][j] = true;
                    } else if (res[i - 1][j] && s.charAt(i - 1) == p.charAt(j - 2)) {
                        res[i][j] = true;
                    } else if (res[i - 1][j] && p.charAt(j - 2) == '.') {
                        res[i][j] = true;
                    }
                } else {
                    if (res[i - 1][j - 1] && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.')) {
                        res[i][j] = true;
                    }
                }
            }
        }

        return res[m + 1][n + 1];
    }

}
