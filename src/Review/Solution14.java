package Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-02-21  9:45
 */
public class Solution14 {

    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        char[] chars = s.toCharArray();
        List<StringBuilder> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            res.add(new StringBuilder());
        }
        //flag非常的巧妙
        int index = 0, flag = -1;
        for (char c : chars) {
            res.get(index).append(c);
            if (index == numRows - 1 || index == 0) {
                flag = -flag;
            }
            index += flag;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (StringBuilder str : res) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        new Solution14().convert("aaa", 3);
    }

}
