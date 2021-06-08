package FourHundredAndSixteen;

/**
 * 分割等和子集
 *
 * @author zhousy
 * @date 2021-06-07  9:43
 */
public class Solution {

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
        
        boolean[][] dp = new boolean[nums.length][target + 1];
        dp[0][0] = true;

        for (int i = 1; i < nums.length; i++) {

            for (int j = 0; j < target + 1; j++) {
                dp[i][j] = dp[i - 1][j];
                if (nums[i] == j) {
                    dp[i][j] = true;
                    continue;
                }
                if (j >= nums[i]) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]];
                }

            }

        }

        return dp[nums.length - 1][target];
    }


    public static void main(String[] args) {
    }
}
