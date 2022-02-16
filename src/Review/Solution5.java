package Review;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-02-16  11:33
 */
public class Solution5 {

    /*public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return length;
        }
        int p1 = 0;
        // 1 2 3 3 3 4
        for (int i = 1; i < length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            nums[p1++] = nums[i - 1];
        }
        nums[p1++] = nums[length - 1];
        return p1;
    }*/

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length <= 1) {
            return length;
        }
        int p1 = 0;
        // 1 2 3 3 3 4
        for (int i = 1; i < length; i++) {
            if (nums[p1] != nums[i]) {
                nums[++p1] = nums[i];
            }
        }
        return p1 + 1;
    }

}
