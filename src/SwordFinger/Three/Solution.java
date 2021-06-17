package SwordFinger.Three;

import java.util.HashSet;
import java.util.Set;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-17  10:40
 */
public class Solution {

    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>((int) (nums.length / 0.75));
        for (int i : nums) {
            if (set.contains(i)){
                return i;
            }
            set.add(i);
        }
        return 0;
    }
    
}
