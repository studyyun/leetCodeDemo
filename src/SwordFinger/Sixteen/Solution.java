package SwordFinger.Sixteen;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-24  8:28
 */
public class Solution {

    public double myPow(double x, int n) {
        if (x == 0){
            return 0;
        }
        //此题n的取值范围为int类型：-2的31次方 <= n <= 2的31次方-1，防止n为-2的31次方时，取相反数，超出了int类型的最大值，所以先转换成long类型
        long b = n;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        double result = 1;
        for (long i = b; i > 0; i = i >> 1) {
            if ((i & 1) == 1) {
                result = result * x;
            }
            x = x * x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().myPow(2.00000, 0));
    }

}
