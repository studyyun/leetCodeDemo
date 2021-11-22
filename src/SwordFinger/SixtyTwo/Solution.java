package SwordFinger.SixtyTwo;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-11-18  8:53
 */
public class Solution {

    public int lastRemaining(int n, int m) {
        
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = (result + m) % i;
        }
        
        return result;
    }
    
}
