package Review;

import java.util.ArrayList;
import java.util.List;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-02-11  9:39
 */
public class Solution1 {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(new Solution1().reverse(Integer.MIN_VALUE));
        List<String> list = new ArrayList<String>(){{
            add("111");
            add("222");
            add("333");
        }};
        System.out.println(list.contains(null));
    }

    public int reverse(int x) {
        int res = 0;
        int remainder = 0;

        while (x != 0) {

            remainder = x % 10;
            x = x / 10;

            if ((res > (Integer.MAX_VALUE / 10)) || (remainder > 7 && res == (Integer.MAX_VALUE / 10))) {
                return 0;
            }
            if ((res < (Integer.MIN_VALUE / 10)) || (remainder < -8 && res == (Integer.MIN_VALUE / 10))) {
                return 0;
            }
            res = res * 10 + remainder;
        }
        return res;
    }

}
