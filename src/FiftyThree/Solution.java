package FiftyThree;

public class Solution {

    //动态规划，类似于滚动数组，将空间复杂度从 O(n)降到了 O(1)
    //和70题类似，都是动态规划，然后通过分析，降低空间复杂度（递归→迭代）
    //详情可见力扣的官方分析
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
