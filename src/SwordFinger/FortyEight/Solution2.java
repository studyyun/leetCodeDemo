package SwordFinger.FortyEight;

import java.util.HashMap;
import java.util.Map;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-08-12  9:21
 */
public class Solution2 {
    
    //滑动窗口，yyds!
    public int lengthOfLongestSubstring(String s) {
        if ("".equals(s) || null == s) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>(256);
        //初始化为 -1 是为了满足当字符串只有一个字符时的情形
        int max = 0, start = -1;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                start = Math.max(start, map.get(s.charAt(i)));
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - start);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().lengthOfLongestSubstring("abcabcbbqweqrvcxzvasfqwqwwerrrwerqdasfazxvzbdfhdg"));
    }

}
