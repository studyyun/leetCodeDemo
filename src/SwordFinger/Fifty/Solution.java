package SwordFinger.Fifty;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-08-16  9:36
 */
public class Solution {

    public char  firstUniqChar(String s) {
//        Map<Character, Boolean> map = new HashMap<>(32);
        
        //有序哈希表，LinkedHashMap是按插入顺序排列的。
        Map<Character, Boolean> map = new LinkedHashMap<>(32);

        char[] chars = s.toCharArray();

        for (char c : chars) {
            map.put(c, !map.containsKey(c));
        }

        /*for (char c : chars) {
            if (map.get(c)) {
                return c;    
            }
        }*/
        
        //如果字符串很长，可减少遍历的次数，要搭配LinkedHashMap
        for (Map.Entry<Character, Boolean> entry : map.entrySet()) {
            if (entry.getValue()) {
                return entry.getKey();
            }
        }
        
        return ' ';
    }
    
}
