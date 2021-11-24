package SwordFinger.SixtySeven;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-11-23  9:00
 */
public class Solution2 {

    public int strToInt(String str) {
        char[] chars = str.trim().toCharArray();
        int i = 1, sign = 1, res = 0, mid = 214748364;
        if(chars.length == 0){
            return 0;
        }
        //先判断正负号
        if (chars[0] == '-') {
            sign = -1;
        } else if (chars[0] != '+') {
            i = 0;
        }
        for (int j = i; j < chars.length; j++) {
            //非数字，正负号在上面已经排除过了
            if (chars[j] < '0' || chars[j] > '9') {
                break;
            }
            //关键一步：
            if (res > mid || (res == mid && chars[j] > '7')) {
                res = sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                return res;
            }
            //数字字符的值可以通过减去0的AscII码来获得
            res = res * 10 + (chars[j] - '0');
        }
        return res * sign;
    }

    public static void main(String[] args) {

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(-2147483648);
    }

}
