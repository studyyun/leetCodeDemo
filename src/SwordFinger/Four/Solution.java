package SwordFinger.Four;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-17  11:06
 */
public class Solution {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        /*if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        //右上角初始起点
        int y = 0,x = matrix[0].length - 1;
        while (y < matrix.length && x >= 0) {
            int val = matrix[y][x];
            if (val == target) {
                return true;
            } else if (val > target) {
                x--;
            } else {
                y++;
            }
        }
        return false;*/
        
        //左下角初始起点
        int i = matrix.length - 1, j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] > target) i--;
            else if (matrix[i][j] < target) j++;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] ints = new int[0][0];
        System.out.println(new Solution().findNumberIn2DArray(ints, 0));
    }

}
