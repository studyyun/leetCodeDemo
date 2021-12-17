package Seventeen;

import java.util.ArrayList;
import java.util.List;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-12-17  8:57
 */
public class Solution {
    
    private List<String> res = new ArrayList<>();
    private String[] strs;
    
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return res;
        }
        strs = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        dfs(digits, 0, new StringBuilder());
        return res;
    }
    
    //回溯法
    private void dfs(String digits, int index, StringBuilder result) {
        if (result.length() == digits.length()) {
            res.add(result.toString());
            return;
        }
        // '3'如何转换成整数3： '3'减去'0'
        int position = digits.charAt(index) - '0';
        String str = strs[position];
        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i));
            dfs(digits, index + 1, result);
            //回溯，先进行递归，再回溯
            result.deleteCharAt(result.length() - 1);
        }
        
    }
    
}
