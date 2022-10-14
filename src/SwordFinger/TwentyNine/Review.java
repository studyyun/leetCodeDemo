package SwordFinger.TwentyNine;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-29  8:54
 */
public class Review {

    public int[] spiralOrder(int[][] matrix) {
        int top = 0, bottom = matrix.length, left = 0, right = matrix[0].length;
        int count = bottom * right;
        int[] res = new int[count];
        bottom--;
        right--;
        int num = 0;
        while (true) {
            //从左到右
            for (int i = left; i <= right; i++) {
                res[num++] = matrix[top][i];
            }
            if ((++top) > bottom) {
                break;
            }
            //从上到下
            for (int i = top; i <= bottom; i++) {
                res[num++] = matrix[i][right];
            }
            if ((--right) < left) {
                break;
            }
            //从右到左
            for (int i = right; i >= left; i--) {
                res[num++] = matrix[bottom][i];
            }
            if ((--bottom) < top) {
                break;
            }
            //从下到上
            for (int i = bottom; i >= top; i--) {
                res[num++] = matrix[i][left];
            }
            if ((++left) > right) {
                break;
            }

        }

        return res;
    }



}
