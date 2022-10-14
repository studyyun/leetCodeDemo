package SwordFinger.Three;

import java.util.HashSet;
import java.util.Set;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-17  10:40
 */
public class Solution2 {

    // [2, 3, 1, 0, 2, 5, 3]
    // [2, 1, 3, 0, 2, 5, 3]
    public int findRepeatNumber(int[] nums) {
        int i = 0 ;
        while (i < nums.length){

            if (i == nums[i]) {
                i++;
                continue;
            }

            if (nums[i] == nums[nums[i]]){
                return nums[i];
            }

            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }
        return 0;
    }

}
