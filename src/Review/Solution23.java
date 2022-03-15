package Review;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-03-15  14:48
 */
public class Solution23 {

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, res = 0;
        for (int num : nums) {
            res += num;
            max = Math.max(max, res);
            res = res < 0 ? 0 : res;
        }
        return max;
    }
    
}
