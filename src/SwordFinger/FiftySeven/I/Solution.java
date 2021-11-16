package SwordFinger.FiftySeven.I;

import java.util.HashMap;
import java.util.Map;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-11-15  9:29
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return result;
            }
            if (map.containsKey(target - nums[i])) {
                result[0] = nums[i];
                result[1] = target - nums[i];
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
    
}
