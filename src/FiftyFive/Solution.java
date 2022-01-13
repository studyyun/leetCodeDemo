package FiftyFive;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-01-13  9:00
 */
public class Solution {

    public boolean canJump(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            //如果当前格子之前(不包括当前格子)能跳的最远距离K小于当前的下标，则说明肯定不能到达当前下标，并且也肯定不能到达最后一个下标
            if (i > k) {
                return false;
            }
            //统计每个格子之前(包括当前格子)能跳的最远距离
            k = Math.max(i + nums[i], k);
        }
        return true;
    }

}
