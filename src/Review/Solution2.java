package Review;

import java.util.Arrays;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-02-14  15:04
 */
public class Solution2 {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }
        String str = strs[0];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i || c != strs[j].charAt(i)) {
                    return str.substring(0, i);
                }
            }
        }
        return str;
    }

/*
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        //按字典序排序
        Arrays.sort(strs);
        String beginStr = strs[0];
        String endStr = strs[strs.length - 1];
        int length = Math.min(beginStr.length(), endStr.length());
        for (int i = 0; i < length; i++) {
            if (beginStr.charAt(i) != endStr.charAt(i)) {
                return beginStr.substring(0, i);
            }
        }
        return beginStr.substring(0, length);
    }
*/

    public static void main(String[] args) {
        String str = "aaa";
        System.out.println(str.substring(0, 0));
        String[] strss = new String[]{"flower","flow","flight"};
        Arrays.sort(strss);
        int i = 5;
    }
}
