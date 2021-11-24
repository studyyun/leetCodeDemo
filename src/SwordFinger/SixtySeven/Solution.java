package SwordFinger.SixtySeven;

import java.util.Arrays;
import java.util.List;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-11-23  9:00
 */
public class Solution {

    public int strToInt(String str) {
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        List<Character> numLists = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
        List<Character> signLists = Arrays.asList('+', '-');
        if (!numLists.contains(str.charAt(0)) && !signLists.contains(str.charAt(0))) {
            return 0;
        }
        StringBuilder strBuild = new StringBuilder();
        long result = 0L;
        for (int i = 0; i < str.length(); i++) {
            //除数字和正负号
            if (!numLists.contains(str.charAt(i)) && !signLists.contains(str.charAt(i))) {
                if (strBuild.length() > 0) {
                    break;
                }
            } else if (signLists.contains(str.charAt(i))) {
                if (strBuild.length() == 0) {
                    strBuild.append(str.charAt(i));
                    continue;
                }
                if (signLists.contains(strBuild.charAt(0)) || strBuild.length() > 0) {
                    break;
                }
            } else {
                strBuild.append(str.charAt(i));
            }
        }

        if (signLists.contains(strBuild.charAt(0))) {

            if (strBuild.length() == 1) {
                return 0;
            }

            String strNum = strBuild.toString();
            for (int i = 1; i < strNum.length(); i++) {
                if (i == strNum.length() - 1 || strNum.charAt(i) != '0') {
                    strNum = strNum.substring(i);
                    break;
                }
            }

            strNum = strBuild.charAt(0) + strNum;
            if (strNum.length() > 11) {
                return strNum.charAt(0) == '+' ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            
            for (int i = 1; i < strNum.length(); i++) {
                result += Character.getNumericValue(strNum.charAt(i)) * Math.pow(10, strNum.length() - 1 - i);
            }
            result = strBuild.charAt(0) == '+' 
                    ? (result > Integer.MAX_VALUE ? Integer.MAX_VALUE : result) : (result * -1 < Integer.MIN_VALUE ? Integer.MIN_VALUE : result * -1);
            return (int) result;
        }
        
        String strNum = strBuild.toString();
        for (int i = 0; i < strNum.length(); i++) {
            if (i == strNum.length() - 1 || strNum.charAt(i) != '0') {
                strNum = strNum.substring(i);
                break;
            }
        }
        
        if (strNum.length() > 10) {
            return Integer.MAX_VALUE;
        }

        for (int i = 0; i < strNum.length(); i++) {
            result += Character.getNumericValue(strNum.charAt(i)) * Math.pow(10, strNum.length() - 1 - i);
        }
        return result > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) result;
    }

    public static void main(String[] args) {

        String str = "  00000000000 ";
        new Solution().strToInt(str);
//        System.out.println(str.substring(0,0));
        for (int i = 0; i < str.length(); i++) {
//            System.out.println(Character.getNumericValue(str.charAt(i)) * 10);
        }
//        System.out.println(Math.pow(2, 3));
//        System.out.println(Character.getNumericValue(str.charAt(2)));
//        new Solution().strToInt("words and 987");
    }

}
