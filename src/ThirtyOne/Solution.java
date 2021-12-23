package ThirtyOne;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-12-21  9:03
 */
public class Solution {

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        //由于题目的原因，所以从后往前遍历找下一个更大的元素
        //这里可以保证：如果出现了nums[i] >= nums[i + 1]，那么i+1到数组的最后一个元素是递减的
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            //进入了这个if判断就说明出现了nums[i] >= nums[i + 1]，同时说明i+1到最后一个元素是递减
            //所以要从后往前遍历，找到比nums[i]大的数里面，最小的那一个
            int j = nums.length - 1;
            while (nums[i] >= nums[j]) {
                j--;
            }
            //交换位置
            swap(i, j, nums);
        }
        //i+1到最后一个元素排序
        reversal(i + 1, nums);
    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reversal(int i, int[] nums) {
        int j = nums.length - 1;
        while (i < j) {
            swap(i, j, nums);
            //因为已经是一个递减的顺序，只要调换位置变成递增就行
            i++;
            j--;
        }
    }

}
