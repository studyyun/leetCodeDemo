package SwordFinger.FortySix;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-10-12  8:29
 */
public class Review {

    public int translateNum(int num) {
        String str = num + "";
        if (str.length() == 1) {
            return 1;
        }
        //可以看成跨阶梯问题，跨一个阶梯还是两个阶梯
        int a = 1, b = 1, c = 0;
        for (int i = 2; i <= str.length(); i++) {
            if (str.substring(i - 2, i).compareTo("25") > 0 || str.substring(i - 2, i).compareTo("10") < 0) {
                c = b;
            } else {
                c = a + b;
            }
            a = b;
            b = c;
        }

        return c;
    }

    public static void main(String[] args) {
        System.out.println(new Review().translateNum(506));
    }

}
