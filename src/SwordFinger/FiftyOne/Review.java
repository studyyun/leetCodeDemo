package SwordFinger.FiftyOne;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-10-18  8:35
 */
public class Review {

    private int[] temp;
    private int count = 0;

    public int reversePairs(int[] nums) {
        temp = new int[nums.length];
        merge(nums, 0, nums.length - 1);
        return count;
    }

    private void merge(int[] nums, int left, int right) {
        if (left < right) {
            int mid = left + ((right - left) >> 1);
            merge(nums, left, mid);
            merge(nums, mid + 1, right);
            dfs(nums, left, right, mid);
        }
    }

    private void dfs(int[] nums, int left, int right, int mid) {
        int i = left, j = mid + 1;
        int index = 0;
        //左右两个小数组开始对比
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[index++] = nums[i++];
            } else {
                count += mid - i + 1;
                temp[index++] = nums[j++];
            }
        }
        //如果左边数组有剩余
        while (i <= mid) {
            temp[index++] = nums[i++];
        }
        //如果右边数组有剩余
        while (j <= right) {
            temp[index++] = nums[j++];
        }
        //合并排序之后的数组覆盖
        for (int m = 0; m < right - left + 1; m++) {
            nums[left + m] = temp[m];
        }

    }

    public static void main(String[] args) {
        int[] ints = new int[]{7, 5, 6, 4};
        new Review().reversePairs(ints);
    }

}
