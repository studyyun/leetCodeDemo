package SwordFinger.FortyFour;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-08-06  8:22
 */
public class Solution {

    public int findNthDigit(int n) {
        int pre = 0, i = 0;
        while (n > 0) {
            pre = n;
            n = (int) (n - (i + 1) * 9 * Math.pow(10, i));
            i++;
        }

        int num = pre / i;
        int remainder = pre - i * num;
        if (remainder == 0) {
            num--;
        }

        int count = (int) (Math.pow(10, --i) + num);
        String countStr = String.valueOf(count);
        if (remainder == 0) {
            return count % 10;
        }
        return Integer.parseInt(countStr.substring(remainder - 1, remainder));

    }

    public static void main(String[] args) {
        System.out.println(new Solution().findNthDigit(1000));
    }

}
