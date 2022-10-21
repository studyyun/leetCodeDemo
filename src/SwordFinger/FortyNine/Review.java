package SwordFinger.FortyNine;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-10-17  8:41
 */
public class Review {

    public int nthUglyNumber(int n) {
        //索引
        int a = 0, b = 0, c = 0;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = Math.min(res[a] * 2, Math.min(res[b] * 3, res[c] * 5));
            if (res[i] == res[a] * 2) {
                a++;
            }
            if (res[i] == res[b] * 3) {
                b++;
            }
            if (res[i] == res[c] * 5) {
                c++;
            }
        }
        return res[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(new Review().nthUglyNumber(15));
    }

}
