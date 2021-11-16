package SwordFinger.FiftySix;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-11-15  9:21
 */
public class Solution {

    public int[] singleNumbers(int[] nums) {
        int z = 0, m = 1, x=0,y=0;
        for (int i : nums) {
            z ^= i;
        }

        while ((z & m) == 0) {
            m <<= 1;
        }

        for (int num : nums) {
            if ((num & m) == 0) {
                x ^= num;
            } else {
                y ^= num;
            }
        }
        
        return new int[]{x,y};
    }
    
}
