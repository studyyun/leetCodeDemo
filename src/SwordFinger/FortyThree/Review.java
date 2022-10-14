package SwordFinger.FortyThree;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-10-09  9:08
 */
public class Review {

    public int countDigitOne(int n) {
        int res = 0;
        int high = n / 10, cur = n % 10, low = 0, digit = 1;
        while (high != 0 || cur != 0) {
            if (cur == 0) {
                res += high * digit;
            } else if (cur == 1) {
                res += high * digit + low + 1;
            } else {
                res += (high + 1) * digit;
            }
            low = low + cur * digit;
            digit = digit * 10;
            cur = high % 10;
            high = high / 10;
        }
        
        return res;
    }
    
    
}
