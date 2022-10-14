package SwordFinger.Sixteen;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-18  8:09
 */
public class Review {
    // x=2  n=8    4 4  16  64
    public double myPow(double x, int n) {
        double res = 1;
        long num = n;
        num = Math.abs(num);
        if (n < 0) {
            x = 1.0 / x;
        }
        for (long i = num; i > 0; i = i >>> 1) {
            if ((i & 1) == 1) {
                res = res * x;
            }
            x = x * x;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Review().myPow(2.00000, Integer.MIN_VALUE));
    }

}
