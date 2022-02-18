package Review;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-02-18  11:11
 */
public class Solution13 {

    /*public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        String maxStr = "";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (j - i <= maxStr.length()) {
                    continue;
                }
                String str = s.substring(i, j);
                if (ifPalindrome(str)) {
                    maxStr = str;
                }
            }
        }
        return maxStr;
    }*/

    public String longestPalindrome(String s) {
        int begin = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            //中心扩展
            //回文串的长度可能是奇数
            int length1 = diffusion(s, i, i);
            //回文串的长度可能是偶数
            int length2 = diffusion(s, i, i + 1);
            //比较，获取长度最大值
            int maxlen = Math.max(length1, length2);
            if (maxlen > (end - begin)) {
                //根据中心点、长度获取到对应的起止点
                begin = i - (maxlen - 1) / 2;
                end = i + maxlen / 2;
            }
        }
        return s.substring(begin, end + 1);
    }

    private int diffusion(String s, int l1, int l2) {
        while (l1 >= 0 && l2 < s.length() && s.charAt(l1) == s.charAt(l2)) {
            l1--;
            l2++;
        }
        return l2 - l1 - 1;
    }

    private boolean ifPalindrome(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(6 / 2);
    }
}
