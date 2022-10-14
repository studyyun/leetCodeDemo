package SwordFinger.Three;

import java.util.HashMap;
import java.util.Map;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-08  14:26
 */
public class Review {

    public int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return nums[i];
            }
            map.put(nums[i], i);
        }
        return -1;
    }

}
