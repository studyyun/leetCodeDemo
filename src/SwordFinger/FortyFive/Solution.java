package SwordFinger.FortyFive;

import java.util.Arrays;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-08-09  8:40
 */
public class Solution {

    public String minNumber(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        StringBuilder stringBuilder = new StringBuilder();
        for (int num : nums) {
            stringBuilder.append(num);
        }
        return stringBuilder.toString();
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int index = getIndex(arr, low, high);
            quickSort(arr, low, index - 1);
            quickSort(arr, index + 1, high);
        }
    }

    private static int getIndex(int[] arr, int low, int high) {
        int temp = arr[low];
        String tempStr = temp + "";
        while (low < high) {

            while (low < high && (arr[high] + tempStr).compareTo(tempStr + arr[high]) >= 0) {
                high--;
            }
            arr[low] = arr[high];

            while (low < high && (arr[low] + tempStr).compareTo(tempStr + arr[low]) <= 0) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = temp;
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {10, 2};
        new Solution().minNumber(nums);
    }
}
