package SwordFinger.FortySix;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-08-10  8:34
 */
public class Solution2 {

    public int translateNum(int num) {
        if (num < 10) {
            return 1;
        }
        int a = 1, b = 1, c = 0, x, y, temp;
        while (num > 0) {
            x = (num / 10) % 10;
            y = num % 10;
            num = num / 10;
            temp = 10 * x + y;
            c = (10 <= temp && temp <= 25) ? (a + b) : b;
            a = b;
            b = c;
        }

        return c;
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().translateNum(25));
    }

}
