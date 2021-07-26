package SwordFinger.Forty;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-07-22  10:07
 */
public class Solution2 {

    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0) {
            return new int[0];
        }
        //利用优先级队列的堆
        //默认为小根堆，初始化为大根堆
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i : arr) {
            if (queue.size() < k) {
                queue.add(i);
            } else if (queue.peek() > i) {
                queue.poll();
                queue.add(i);
            }
        }
        
        return queue.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 8, 6, 7, 2, 3, 9, 10, 0};
//        int[] arr = {2, 4, 1, 0, 3, 5};
        int[] leastNumbers = new Solution2().getLeastNumbers(arr, 6);
        for (int i : leastNumbers) {
            System.out.println(i);
        }
    }

}
