package Review;

import java.util.ArrayList;
import java.util.List;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-02-21  10:15
 */
public class Solution15 {

    public String countAndSay(int n) {
        StringBuilder strBuilder;
        List<String> list = new ArrayList<>();
        list.add("1");
        for (int i = 1; i < n; i++) {
            strBuilder = new StringBuilder();
            String s = list.get(i - 1);
            int l1 = 0, l2 = 0;
            while (l2 < s.length()) {
                if (s.charAt(l1) != s.charAt(l2)) {
                    strBuilder.append(l2 - l1).append(s.charAt(l1));
                    l1 = l2;
                }
                l2++;
            }
            strBuilder.append(l2 - l1).append(s.charAt(l1));
            list.add(strBuilder.toString());
        }
        return list.get(n - 1);
    }

    public static void main(String[] args) {
        new Solution15().countAndSay(6);
    }

}
