package Review;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-02-18  10:02
 */
public class Solution12 {

    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        int begin = 0, mul = 1, res = 0;
        if (s.charAt(0) == '-') {
            mul = -1;
            begin = 1;
        }
        if (s.charAt(0) == '+') {
            mul = 1;
            begin = 1;
        }

        while (begin < s.length()) {
            char c = s.charAt(begin);
            int num = c - '0';
            if (num < 0 || num > 9) {
                return res * mul;
            }
            if (mul == 1 && (res > 214748364 || (res == 214748364 && num > 7))) {
                return Integer.MAX_VALUE;
            }
            if (mul == -1 && (res > 214748364 || (res == 214748364 && num > 8))) {
                return Integer.MIN_VALUE;
            }
            res = res * 10 + num;
            begin++;

        }
        return res * mul;
    }

    public static void main(String[] args) {
        System.out.println(new Solution12().myAtoi("-91283472332"));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println('+' * 1);
    }
}
