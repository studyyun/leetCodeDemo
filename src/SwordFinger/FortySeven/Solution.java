package SwordFinger.FortySeven;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-08-11  10:16
 */
public class Solution {
    
    //动态规划搞死个人：
    //使用DFS是为了遍历所有方案。对于本题，如果所有方案之间并没有 方案 = 子方案 + 当前单元格 的性质，那么就不能用动态规划，得暴力去搜索遍历。 动态规划的特点是利用了重复子结构，即消除了所有重复计算
    public int maxValue(int[][] grid) {

        /*//这个多申请一列一行，简直绝了！！！
        int[][] dp = new int[grid.length + 1][grid[0].length + 1];
        for (int i = 1; i <= grid.length; i++) {
            for (int j = 1; j <= grid[0].length; j++) {

                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i-1][j-1];

            }
        }
        return dp[grid.length][grid[0].length];*/
        
        
        /*int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j];
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + grid[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
                }

            }
        }
        return dp[grid.length - 1][grid[0].length - 1];*/
        
        /*int[] dp = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (i == 0 && j == 0) {
                    dp[j] = grid[i][j];
                } else if (i == 0) {
                    dp[j] = dp[j - 1] + grid[i][j];
                } else if (j == 0) {
                    dp[j] = dp[j] + grid[i][j];
                } else {
                    dp[j] = Math.max(dp[j-1], dp[j]) + grid[i][j];
                }

            }
        }
        
        return dp[dp.length-1];*/

        int[] dp = new int[grid[0].length + 1];
        for (int i = 1; i <= grid.length; i++) {
            for (int j = 1; j <= grid[0].length; j++) {
                
                dp[j] = Math.max(dp[j-1], dp[j]) + grid[i-1][j-1];
                
            }
        }

        return dp[dp.length-1];
        
    }


    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(new Solution().maxValue(grid));
    }

}
