package SwordFinger.Forty;

import java.util.Arrays;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-09-19  9:42
 */
public class Review {

    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        return quickSort(arr, 0, arr.length - 1, k - 1);
    }

    private int[] quickSort(int[] arr, int left, int right, int k) {
        int index = dfs(arr, left, right);
        if (index == k) {
            return Arrays.copyOf(arr, k + 1);
        }
        return index < k ? quickSort(arr, index + 1, right, k) : quickSort(arr, left, index - 1, k);
    }
    
    //快排思想
    private int dfs(int[] arr, int left, int right) {
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
        return right;
    }
    
}
