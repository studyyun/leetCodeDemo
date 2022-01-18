package SixtyFour;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-01-18  9:07
 */
public class Solution {

    public int minPathSum(int[][] grid) {
        /*int[][] res = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                    res[i][j] = grid[i][j];
                } else if (i == 0) {
                    res[i][j] = res[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    res[i][j] = res[i - 1][j] + grid[i][j];
                } else {
                    res[i][j] = Math.min(res[i - 1][j], res[i][j - 1]) + grid[i][j];
                }
            }
        }
        return res[grid.length - 1][grid[0].length - 1];*/

        int[] res = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                    res[j] = grid[i][j];
                } else if (i == 0) {
                    res[j] = res[j - 1] + grid[i][j];
                } else if (j == 0) {
                    res[j] = res[j] + grid[i][j];
                } else {
                    res[j] = Math.min(res[j], res[j - 1]) + grid[i][j];
                }
            }
        }
        return res[grid[0].length - 1];
        
    }

}
