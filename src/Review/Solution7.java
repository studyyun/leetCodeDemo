package Review;

import java.util.Arrays;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-02-17  10:08
 */
public class Solution7 {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = (digits[i] + 1) % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

}
