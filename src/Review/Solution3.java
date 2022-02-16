package Review;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-02-15  9:19
 */
public class Solution3 {

    /*public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int inital = x, res = 0;
        while (x != 0) {
            int i = x % 10;
            x = x / 10;
            res = res * 10 + i;
        }
        return res == inital;
    }*/

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int res = 0;
        //遍历一半就行
        while (x > res) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        //偶数位和奇数位都进行判断
        return x == res || (x == res / 10);
    }

}
