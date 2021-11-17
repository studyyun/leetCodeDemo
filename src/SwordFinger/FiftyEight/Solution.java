package SwordFinger.FiftyEight;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-11-17  9:06
 */
public class Solution {

    public String reverseWords(String s) {
//      "the sky is blue"
        /*s = s.trim();
        StringBuilder strBuild = new StringBuilder();
        int left = s.length() - 1, right = left;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && left != right) {
                strBuild.append(s, left + 1, right + 1).append(" ");
                left--;
                right = left;
                continue;
            }
            if (s.charAt(i) == ' ' && left == right) {
                right--;
            }
            left--;
        }
        
        return strBuild.append(s, left + 1, right + 1).toString();*/

        s = s.trim();
        StringBuilder strBuild = new StringBuilder();
        int left = s.length() - 1, right = left;
        while (left >= 0) {
            while (left >= 0 && s.charAt(left) != ' ') {
                left--;
            }
            strBuild.append(s, left + 1, right + 1);
            if (left > 0) {
                strBuild.append(" ");
            }
            //跳过单词间的所有空格
            while (left >= 0 && s.charAt(left) == ' ') {
                left--;
            }
            right = left;
        }
        return strBuild.toString();
    }


    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(new Solution().reverseWords(s));

    }
}
