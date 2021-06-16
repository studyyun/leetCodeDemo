package OneHundredAndThirtyNine;

import java.util.ArrayList;
import java.util.List;

/**
 * 139.单词拆分
 *
 * @author zhousy
 * @date 2021-06-15  8:43
 */
public class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];

    }

    public static void main(String[] args) {
        String str = "leetcode";
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        System.out.println(new Solution().wordBreak(str, list));
    }

}
