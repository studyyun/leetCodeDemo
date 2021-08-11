package SwordFinger.FortySeven;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-08-11  17:58
 */
public class Solution2 {

    /*private int max = 0;

    public int maxValue(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0){
            return max;
        }
        dfs(grid, grid[0][0], 0, 0);
        return max;
    }

    public void dfs(int[][] grid, int count, int x, int y) {
        if (x == grid.length - 1 && y == grid[0].length - 1) {
            max = Math.max(max, count);
        } else if (x == grid.length - 1){
            for (int i = y+1; i <= grid[0].length - 1; i++) {
                count += grid[x][i];
            }
            max = Math.max(max,count);
//            dfs(grid, count + grid[x][y + 1], x, y + 1);
        } else if (y == grid[0].length - 1){
            for (int i = x+1; i <= grid.length - 1; i++) {
                count += grid[i][y];
            }
            max = Math.max(max,count);
//            dfs(grid, count + grid[x + 1][y], x + 1, y);
        } else {
            dfs(grid, count + grid[x + 1][y], x + 1, y);
            dfs(grid, count + grid[x][y + 1], x, y + 1);
        }

    }*/


    int[][] store;

    public int maxValue(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;
        store = new int[grid.length][grid[0].length];
        return maxValue(grid, 0, 0);
    }


    public int maxValue(int[][] grid, int i, int j) {

        if (i >= grid.length || j >= grid[0].length)
            return 0;

        if (store[i][j] != 0)
            return store[i][j];
        int cur = grid[i][j];


        if (i < grid.length - 1 && j < grid[0].length - 1)
            cur += Math.max(maxValue(grid, i + 1, j), maxValue(grid, i, j + 1));
        else if (i < grid.length - 1)
            cur += maxValue(grid, i + 1, j);
        else if (j < grid[0].length - 1)
            cur += maxValue(grid, i, j + 1);
        store[i][j] = cur;
        return store[i][j];
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(new Solution2().maxValue(grid));
    }

}
