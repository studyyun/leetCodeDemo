import java.util.List;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-05-25  12:48
 */
public class SortTest {
    
    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 8, 6, 7, 2, 3, 9, 10, 0};
//        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //冒泡排序
//        BubbleSort.test(arr);
        //选择排序
//        SelectionSort.test(arr);
        //插入排序
//        InsertionSort.test(arr);
        //快速排序
        QuickSort.quickSort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
    }

}

/**
 * 冒泡排序
 */
class BubbleSort{
    static void test(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < (length - 1 - i); j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

/**
 * 选择排序
 */
class SelectionSort{
    static void test(int[] arr) {
        int length = arr.length;
        int minIndex;
        for (int i = 0; i < length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

/**
 * 插入排序
 */
class InsertionSort{
    static void test(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int preIndex = i - 1;
            int current = arr[i];
            while (preIndex >= 0 && arr[preIndex] > current){
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[++preIndex] = current;
        }
    }
}

/**
 * 快速排序
 */
class QuickSort{
    
    static void quickSort(int[] arr, int low, int high) {
        if (low < high){
            int index = getIndex(arr, low, high);
            quickSort(arr,low,index-1);
            quickSort(arr,index+1,high);
        }
    }

    private static int getIndex(int[] arr, int low, int high) {
        int temp = arr[low];
        while (low < high){

            while (low < high && arr[high] >= temp) {
                high--;
            }
            arr[low] = arr[high];
            
            while (low < high && arr[low] <= temp){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = temp;
        return low;
    }
    
}