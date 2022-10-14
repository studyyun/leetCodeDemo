package SwordFinger.Ten.I;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-10  8:53
 */
public class Review {

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int num = 1000000007;
        int a = 0, b = 1, c = 0;
        while (n > 1) {
            c = a + b;
            if (c > num) {
                c = c - num;
            }
            a = b;
            b = c;
            n--;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(new Review().fib(100));
    }

}
