package FortyEight;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-01-06  9:37
 */
public class Solution {

    public void rotate(int[][] matrix) {
        int xLength = matrix.length - 1, yLength = matrix[0].length - 1;
        
        //先水平翻转
        for (int i = 0; i <= (xLength / 2); i++) {
            for (int j = 0; j <= yLength; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[xLength - i][j];
                matrix[xLength - i][j] = temp;
            }
        }
        
        //然后主对角线翻转
        for (int i = 0; i <= xLength; i++) {
            for (int j = i + 1; j <= yLength; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }

}
