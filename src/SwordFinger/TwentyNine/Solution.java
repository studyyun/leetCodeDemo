package SwordFinger.TwentyNine;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-29  8:29
 */
public class Solution {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0){
            return new int[0];
        }
        int xLength = matrix[0].length, yLength = matrix.length, count = 0;
        int top = 0, right = xLength - 1, bottom = yLength - 1, left = 0;
        int[] ints = new int[xLength * yLength];

        while (true) {
            //从左到右
            for (int i = left; i <= right; i++) {
                ints[count++] = matrix[top][i];
            }
            if ((++top) > bottom) {
                break;
            }

            //从上到下
            for (int i = top; i <= bottom; i++) {
                ints[count++] = matrix[i][right];
            }
            if ((--right) < left) {
                break;
            }

            //从右到左
            for (int i = right; i >= left; i--) {
                ints[count++] = matrix[bottom][i];
            }
            if ((--bottom) < top) {
                break;
            }
            

            //从下到上
            for (int i = bottom; i >= top; i--) {
                ints[count++] = matrix[i][left];
            }
            if ((++left) > right) {
                break;
            }
        }
        return ints;
    }

    public static void main(String[] args) {
        
    }
}
