package SwordFinger.FiftyOne;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-12-09  8:57
 */
public class Solution {

    private int count;
    
    public int reversePairs(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        merge(0, nums.length - 1, nums);
        return count;
    }
    
    //归并排序
    public void merge(int left, int right, int[] nums) {
        // (left + right) / 2，这样写有可能会整数溢出，所以采用下面这种方式写
        int mid = left + ((right - left) >> 1);
        //这里的递归是从深→浅，从小的有序数组一个个合并到大的数组
        if (left < right) {
            merge(left, mid, nums);
            merge(mid + 1, right, nums);
            sort(left, mid, right, nums);
        }
    }

    public void sort(int left, int mid, int right, int[] nums) {
        int temp1 = left, temp2 = mid + 1, index = 0;
        int[] tempArr = new int[right - left + 1];
        while (temp1 <= mid && temp2 <= right) {
            if (nums[temp1] > nums[temp2]) {
                //统计逆序对，因为归并排序，是一个个小的有序数组(从小到大)合并进行排序，所以当前面的数大于这个数时，数组中后面的数也会大于这个数
                //eg： [3,5,7] 和 [2,6,10] 进行合并，发现 3 > 2，那么自然，3所在数组的后面几个数字都会大于2
                count += (mid - temp1 + 1);
                tempArr[index++] = nums[temp2++];
            } else {
                tempArr[index++] = nums[temp1++];
            }
        }
        //将剩下的数字放入数组中
        while (temp1 <= mid) {
            tempArr[index++] = nums[temp1++];
        }
        //将剩下的数字放入数组中
        while (temp2 <= right) {
            tempArr[index++] = nums[temp2++];
        }
        //将排好序的子数组覆盖原数组，方便后续的递归
        if (tempArr.length >= 0) {
            System.arraycopy(tempArr, 0, nums, left, tempArr.length);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{7,5,6,4};
        new Solution().reversePairs(nums);
    }
}
