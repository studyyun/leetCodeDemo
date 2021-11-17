package SwordFinger.SixtyOne;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-11-17  10:22
 */
public class Solution {

    public boolean isStraight(int[] nums) {
        int min = Integer.MAX_VALUE, max = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        if (min == Integer.MAX_VALUE && max == 0) {
            return true;
        }
        return (max - min) <= 4;
    }

}
