package Review;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-02-16  16:41
 */
public class Solution6 {

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int num : nums) {
            if (num != val) {
                nums[index++] = num;
            }
        }
        return index;
    }

}
