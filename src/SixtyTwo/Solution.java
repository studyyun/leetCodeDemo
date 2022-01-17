package SixtyTwo;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-01-17  9:19
 */
public class Solution {

    /*public int uniquePaths(int m, int n) {
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    res[i][j] = 1;
                    continue;
                }
                res[i][j] = res[i - 1][j] + res[i][j - 1];
            }
        }
        return res[m - 1][n - 1];
    }*/

    //一般动态规划都可以优化内存占用
    public int uniquePaths(int m, int n) {
        int[] cur = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    cur[j] = 1;
                    continue;
                }
                cur[j] = cur[j] + cur[j - 1];
            }
        }
        return cur[n - 1];
    }
    
}
