package SwordFinger.Forty;

import java.util.Arrays;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-07-22  10:07
 */
public class Solution {

    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 1) {
            return Arrays.copyOf(arr, 1);
        }
        return quickSort(arr, 0, arr.length - 1, k - 1);
    }

    public int[] quickSort(int[] arr, int left, int right, int k) {
        int index = getIndex(arr, left, right);
        if (index == k) {
            return Arrays.copyOf(arr, k + 1);
        }
        return index < k ? quickSort(arr, index + 1, right, k) : quickSort(arr, left, index - 1, k);
    }

    public int getIndex(int[] arr, int left, int right) {
        int temp = arr[left];
        while (left < right) {

            while (left < right && arr[right] >= temp) {
                right--;
            }
            arr[left] = arr[right];

            while (left < right && arr[left] <= temp) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = temp;
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 8, 6, 7, 2, 3, 9, 10, 0};
//        int[] arr = {2, 4, 1, 0, 3, 5};
        int[] leastNumbers = new Solution().getLeastNumbers(arr, 6);
        for (int i : leastNumbers) {
            System.out.println(i);
        }
    }

}
