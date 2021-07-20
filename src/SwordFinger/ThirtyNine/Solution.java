package SwordFinger.ThirtyNine;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-07-20  8:28
 */
public class Solution {
    
    //摩尔投票法
    public int majorityElement(int[] nums) {
        int votes = 0,x = 0;
        for (int num : nums) {
            if (votes == 0) {
                x = num;
                votes++;
            } else {
                votes = votes + (x == num ? 1 : -1);
            }
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().majorityElement(new int[]{3,3,4}));
    }

}
