package SwordFinger.ThirtyEight;

import java.util.HashSet;
import java.util.Set;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-09-14  8:56
 */
public class Review {

    private Set<String> res;

    public String[] permutation(String s) {
        res = new HashSet<>();
        boolean[] booleans = new boolean[s.length()];
        dfs(s, new StringBuilder(), booleans);
        return res.toArray(new String[]{});
    }

    private void dfs(String str, StringBuilder strBuilder, boolean[] booleans) {
        if (strBuilder.length() == str.length()) {
            res.add(strBuilder.toString());
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if (booleans[i]) {
                continue;
            }
            booleans[i] = true;
            strBuilder.append(str.charAt(i));
            dfs(str, strBuilder, booleans);
            booleans[i] = false;
            strBuilder.deleteCharAt(strBuilder.length() - 1);

        }
    }

    public static void main(String[] args) {
        //new Review().permutation("abc");
        String[] aabs = new Review().permutation("abc");
        int i = 0;
    }

}
