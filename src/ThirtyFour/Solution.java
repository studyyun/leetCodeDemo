package ThirtyFour;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-12-24  9:09
 */
public class Solution {

    public int[] searchRange(int[] nums, int target) {
        int leftIndex = binary(nums, target);
        int rightIndex = binary(nums, target + 1) - 1;
        if (leftIndex > rightIndex || nums[leftIndex] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{leftIndex, rightIndex};
    }

    // [5,7,7,8,8,10]
    private int binary(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        //找第一个大于等于target的数
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        new Solution().searchRange(nums, 2);
    }
}
