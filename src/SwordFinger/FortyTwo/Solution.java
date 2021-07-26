package SwordFinger.FortyTwo;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-07-26  8:47
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -3, 4};
        System.out.println(new Solution().maxSubArray(arr));
    }

}
