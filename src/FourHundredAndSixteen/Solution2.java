package FourHundredAndSixteen;

/**
 * 分割等和子集
 *
 * @author zhousy
 * @date 2021-06-07  9:43
 */
public class Solution2 {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        int maxNum = 0;
        for (int i : nums) {
            sum += i;
            maxNum = Math.max(maxNum, i);
        }
        int target = sum / 2;
        //如果是奇数或者最大数大于总和的一半
        if ((sum & 1) == 1 || maxNum > target) {
            return false;
        }

        if (maxNum == target) {
            return true;
        }

        //思路优化，一维数组
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        dp[nums[0]] = true;

        for (int i = 1; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                if (dp[target]) {
                    return true;
                }
                //   新dp[j] = 旧dp[j] || 旧dp[j - nums[i]]，所以这里要从后往前遍历，防止旧的值已经被刷新成新的值了
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[target];
    }


    public static void main(String[] args) {
    }
}
