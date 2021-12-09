package SwordFinger.FortyThree;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-12-08  8:47
 */
public class Solution {
    // 12301  12031  12133  12233
    public int countDigitOne(int n) {
        int high = 0, low = 0, cur = 0, digt = 1, res = 0;

//        low = low + cur * digt;
//        digt = 1;
//        high = n;
//        cur = n % 10;

        while ( n != 0) {
            low = low + cur * (digt / 10);
            high = n / 10;
            cur = n % 10;
            if (cur == 0) {
                res += high * digt;
            } else if (cur == 1) {
                res += high * digt + low + 1;
            } else {
                res += high * digt + digt;
            }
            digt = digt * 10;
            n = n / 10;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countDigitOne(12));
    }

}
