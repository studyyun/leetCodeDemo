package FiftyThree;

public class Solution {

    public int maxSubArray(int[] nums) {
        int pre = 0;
        int maxVal = nums[0];

        for (int num : nums) {
            pre = Math.max(pre + num, num);
            maxVal = Math.max(pre, maxVal);
        }

        return maxVal;

    }

}
