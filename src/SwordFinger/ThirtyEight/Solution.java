package SwordFinger.ThirtyEight;

import java.util.HashSet;
import java.util.Set;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-07-19  9:01
 */
public class Solution {

    private char[] chars;
    private Set<String> strs;

    public String[] permutation(String s) {
        chars = s.toCharArray();
        strs = new HashSet<>();
        boolean[] bs = new boolean[chars.length];
        StringBuilder stringBuilder = new StringBuilder(chars.length);
        dfs(bs, stringBuilder);
        return strs.toArray(new String[0]);
    }

    public void dfs(boolean[] bs, StringBuilder strBuilder) {

        if (strBuilder.length() == chars.length) {
            strs.add(strBuilder.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (bs[i]) {
                continue;
            }
            strBuilder.append(chars[i]);
            bs[i] = true;
            dfs(bs, strBuilder);
            strBuilder.deleteCharAt(strBuilder.length() - 1);
            bs[i] = false;
        }
    }

    public static void main(String[] args) {
        String[] abcs = new Solution().permutation("abc");
        for (String s : abcs) {
            System.out.println(s);
        }
    }

}
