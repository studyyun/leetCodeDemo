package SwordFinger.FortyEight;

import java.util.HashMap;
import java.util.Map;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-08-12  9:21
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if ("".equals(s) || null == s) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>(s.length() * 5 / 4);
        int max = 0, temp = 0;
        for (int i = 0; i < s.length(); i++) {
            Integer index = map.getOrDefault(s.charAt(i), -1);
            map.put(s.charAt(i), i);
            temp = (i - index) > temp ? (temp + 1) : (i - index);
            max = Math.max(max, temp);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("abcabcbbqweqrvcxzvasfqwqwwerrrwerqdasfazxvzbdfhdg"));
    }

}
