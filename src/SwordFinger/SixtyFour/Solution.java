package SwordFinger.SixtyFour;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-11-19  8:57
 */
public class Solution {

    public int sumNums(int n) {
        boolean b = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }
    
}
