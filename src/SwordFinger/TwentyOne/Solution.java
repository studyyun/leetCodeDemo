package SwordFinger.TwentyOne;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-28  8:38
 */
public class Solution {

    public int[] exchange(int[] nums) {

        int i = 0, j = nums.length - 1;

        while (i != j) {

            if ((nums[i] & 1) == 1) {
                i++;
                continue;
            }

            if ((nums[j] & 1) == 0) {
                j--;
                continue;
            }
            
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        
        return nums;

    }

}
