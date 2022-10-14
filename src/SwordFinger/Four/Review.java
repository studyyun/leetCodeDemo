package SwordFinger.Four;

import java.util.HashMap;
import java.util.Map;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-08  14:26
 */
public class Review {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix[0].length; j++) {
                int num = matrix[i][j];
                if (num == target) {
                    return true;
                } else if (num > target) {
                    break;
                }
            }
        }
        return false;
    }

}
