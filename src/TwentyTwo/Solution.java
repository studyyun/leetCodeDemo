package TwentyTwo;

import java.util.*;

public class Solution {
    //回溯：1、把递归树画出来（可以只挑一个很小的树）
    // 2、总结递归树什么时候“剪枝”，也就是什么情况下不做逻辑处理，直接删除这种情况
    public List<String> generateParenthesis(int n) {
        List<String> resultList = new ArrayList<>(n);


        dfs(resultList, new StringBuilder(),0,0,n);

        return resultList;
    }

    private void dfs(List<String> resultList, StringBuilder result, int left, int right, int n) {

        if (left == n && right == n){
            resultList.add(result.toString());
            return;
        }

        if (left < right){
            return;
        }

        if (left < n){
            result.append("(");
            dfs(resultList, result, left + 1, right, n);
            result.deleteCharAt(result.length() - 1);
        }

        if (right < n){
            result.append(")");
            dfs(resultList, result, left, right + 1, n);
            result.deleteCharAt(result.length() - 1);
        }

    }


    /*public List<String> generateParenthesis(int n) {
        List<String> resultList = new ArrayList<>(n);


        dfs(resultList, "",0,0,n);

        return resultList;
    }

    private void dfs(List<String> resultList, String path, int left, int right, int n){

        if (left == n && right == n){
            resultList.add(path);
            return;
        }

        if (left < right){
            return;
        }

        if (left < n){
            //因为字符串的特殊性，每次都是新生成一个对象，所以不需要进行回溯
            dfs(resultList, path + "(", left + 1, right, n);
        }

        if (right < n){
            dfs(resultList, path + ")", left, right + 1, n);
        }

    }*/

    /*public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        backtrack(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, StringBuilder cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            ans.add(cur.toString());
            return;
        }
        if (open < max) {
            cur.append('(');
            backtrack(ans, cur, open + 1, close, max);
            cur.deleteCharAt(cur.length() - 1);
        }
        if (close < open) {
            cur.append(')');
            backtrack(ans, cur, open, close + 1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }*/


    public static void main(String[] args) {
        List<String> list = new Solution().generateParenthesis(3);
        list.forEach(System.out::println);
    }

}
