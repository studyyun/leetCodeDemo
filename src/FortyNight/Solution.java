package FortyNight;

import java.util.*;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-01-07  9:03
 */
public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String mapStr = new String(chars);
            List<String> list = map.getOrDefault(mapStr, new ArrayList<>());
            list.add(str);
            map.put(mapStr, list);
        }
        
        return new ArrayList<>(map.values());
        
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            System.out.println(new String(chars));
        }
        /*List<String> stringList = new ArrayList<String>(){{
            add("111");
            add("222");
            add("333");
            add("444");
        }};
        for (String s : stringList) {
            System.out.println(s);
            stringList.remove(stringList.size() - 1);
        }*/
    }
    
}
