package SwordFinger.TwentyOne;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-24  8:18
 */
public class Review {

    public int[] exchange(int[] nums) {

        int left = 0, right = nums.length - 1;

        while (left < right) {

            if ((nums[left] & 1) == 1) {
                left++;
                continue;
            }

            if ((nums[right] & 1) == 0) {
                right--;
                continue;
            }

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }

        return nums;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        new Review().exchange(nums);
    }

}
