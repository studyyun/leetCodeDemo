package SwordFinger.FiftyThree.I;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-11-09  8:52
 */
public class Solution {

    public int search(int[] nums, int target) {
        if (nums.length == 1 && nums[0] == target) {
            return 1;
        }
        //优化一下，相当于找到两个右边界
        return find(nums, target) - find(nums, target - 1);
        
        /*int i = 0, j = nums.length - 1, mid, right;
        //找右边界
        while (i <= j) {
            mid = (i + j) / 2;
            if (nums[mid] <= target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        
        right = i;
        i = 0;
        j = nums.length - 1;
        
        //找左边界
        while (i <= j) {
            mid = (i + j) / 2;
            if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        
        return right - j - 1;*/
    }
    
    private int find(int[] nums, int target) {
        int i = 0, j = nums.length - 1, mid;
        while (i <= j) {
            mid = (i + j) / 2;
            if (nums[mid] <= target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(new Solution().search(arr, target));
    }
}
