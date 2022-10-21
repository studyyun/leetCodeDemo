package SwordFinger.FiftyThree.II;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-10-20  9:23
 */
public class Review {

    public int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int mid = i + ((j - i) >> 1);
            if (nums[mid] == mid) {
                i = mid + 1;
            } else if (nums[mid] > mid){
                j = mid - 1;
            }
        }
        return i;
    }

}
