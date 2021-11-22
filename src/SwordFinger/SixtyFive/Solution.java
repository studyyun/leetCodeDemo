package SwordFinger.SixtyFive;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-11-22  8:50
 */
public class Solution {

    //分为进位的部分和不进位的部分
    public int add(int a, int b) {
        while (b != 0) {
            int sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }

        return a;
    }
}
