package ThirtyThree;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-12-22  8:56
 */
public class Solution {
    //  nums = [4,5,6,7,0,1,2], target = 0   res = 4
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            }
            //找准对比的量很关键，这里通过对比nums[0]和nums[mid]，先确定好mid在哪一段里面
            if (nums[0] <= nums[mid]) {
                if (nums[mid] > target && target >= nums[0]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (nums[0] > nums[mid]) {
                if (nums[mid] < target && target < nums[0]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int[] nums = new int[]{1,3};
        int target = 0;
        System.out.println(new Solution().search(nums, target));
    }

}
