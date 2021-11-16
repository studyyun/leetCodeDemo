package SwordFinger.FiftySeven.I;

import java.util.HashMap;
import java.util.Map;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-11-15  9:29
 */
public class Solution2 {

    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                return new int[]{nums[left], nums[right]};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            } 
        }
        return new int[]{};
    }
    
}
