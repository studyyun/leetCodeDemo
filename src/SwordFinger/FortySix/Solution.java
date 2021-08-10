package SwordFinger.FortySix;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-08-10  8:34
 */
public class Solution {

    public int translateNum(int num) {
        if (num < 10) {
            return 1;
        }
        String s = Integer.toString(num);
        int a = 1, b = 1, c = 0;
        for (int i = 2; i <= s.length(); i++) {
            String k = s.substring(i - 2, i);
            c = (0 <= k.compareTo("10") && k.compareTo("25") <= 0) ? (a + b) : b;
            a = b;
            b = c;
        }

        return c;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().translateNum(12258));
    }

}
