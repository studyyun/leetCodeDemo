package SwordFinger.Fifteen;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-23  11:42
 */
public class Solution {

    public int hammingWeight(int n) {
        int count = 0;
        
        while (n != 0){
            if ((n & 1) == 1){
                count++;
            }
            n = n >>> 1; 
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().hammingWeight(0B11111111111111111111111111111101));
    }
    
}
