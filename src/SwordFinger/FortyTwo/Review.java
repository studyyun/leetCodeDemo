package SwordFinger.FortyTwo;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-09-21  8:45
 */
public class Review {

    public int maxSubArray(int[] nums) {
        
        int sum = 0, res = Integer.MIN_VALUE;

        for (int num : nums) {
            sum += num;
            res = Math.max(res, sum);
            sum = sum < 0 ? 0 : sum;
        }
        return res;
        
    }
    
}
