package SwordFinger.FiftyThree.II;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-11-10  8:59
 */
public class Solution {
    
    public int missingNumber(int[] nums) {
        int m = 0, i = 0, j = nums.length-1;

        while (i <= j) {
            m = (i + j)/2;
            if (nums[m] == m) {
                i = m + 1;
            } else {
                j = m - 1;
            } 
        }
        
        return i;
    }

}
