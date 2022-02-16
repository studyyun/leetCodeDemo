package Review;

import java.util.HashMap;
import java.util.Map;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-02-15  10:06
 */
public class Solution4 {

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>(16) {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int res = 0, preNum = map.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = map.get(s.charAt(i));
            if (preNum < num) {
                res -= preNum;
            } else {
                res += preNum;
            }
            preNum = num;
        }
        res += preNum;
        return res;
    }

}
