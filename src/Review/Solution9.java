package Review;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-02-17  11:14
 */
public class Solution9 {

    public int searchInsert(int[] nums, int target) {
        int mid = 0, left = 0, right = nums.length - 1;
        if (nums[0] > target) {
            return 0;
        }
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (nums[mid] < target) {
            return mid + 1;
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution9().searchInsert(new int[]{1, 3}, 2));
    }

}
