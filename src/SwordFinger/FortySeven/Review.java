package SwordFinger.FortySeven;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-10-13  8:52
 */
public class Review {
    

    public int maxValue(int[][] grid) {
        if (grid.length == 1 && grid[0].length == 1) {
            return grid[0][0];
        }
        int[] res = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                res[j] = Math.max(res[j], j - 1 < 0 ? 0 : res[j - 1]) + grid[i][j];
            }
        }
        return res[grid[0].length - 1];
    }

    public static void main(String[] args) {
        int[][] ints = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(new Review().maxValue(ints));
    }
    
}
