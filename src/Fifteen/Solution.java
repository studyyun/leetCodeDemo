package Fifteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-12-15  8:43
 */
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        //先排序，很重要
        Arrays.sort(nums);
        if (nums.length == 0 || nums[0] > 0) {
            return null;
        }
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return lists;
            }
            //排除重复的情况
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            //固定住一个数，然后另外两个首尾指针遍历
            int left = i + 1, right = nums.length - 1;
            
            while (left < right) {
                int res = nums[i] + nums[left] + nums[right];
                if (res == 0) {
                    lists.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //去重
                    while (left < right && nums[left] == nums[++left]) {}
                    while (left < right && nums[right] == nums[--right]) {}
                } else if (res < 0) {
                    while (left < right && nums[left] == nums[++left]) {}
                } else {
                    while (left < right && nums[right] == nums[--right]) {}
                } 
            }
            
        }
        return lists;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,0,0,2,2};
        new Solution().threeSum(nums);
    }

}
