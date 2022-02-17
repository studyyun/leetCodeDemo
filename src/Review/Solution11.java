package Review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-02-17  15:13
 */
public class Solution11 {

    /*public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int max = 0;
        int i = 0, p2 = 1;
        //abcabcbb
        while (i < s.length()) {
            StringBuilder str = new StringBuilder(s.substring(i, p2));
            int index;
            while ((index = str.indexOf(""+s.charAt(p2))) == -1) {
                str.append(s.charAt(p2));
                p2++;
                if (p2 == s.length()) {
                    return Math.max(max, str.length());
                }
            }
            max = Math.max(max, str.length());
            i = i + index + 1;
        }
        return max;
    }*/

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int p1 = 0, max = 0;
        //dqwtegsavdfghdshst1561
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                p1 = Math.max(p1, map.get(c) + 1);
            }
            map.put(c, i);
            max = Math.max(max, i - p1 + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "dqwtegsavdfghdshst1561";
        new Solution11().lengthOfLongestSubstring(s);
    }

}
