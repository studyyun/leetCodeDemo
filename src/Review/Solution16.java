package Review;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-02-23  17:17
 */
public class Solution16 {

    /*public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((v1, v2) -> v2 - v1);
        int left = 0, right = k - 1;
        int[] maxNums = new int[nums.length - k + 1];
        for (int i = 0; i <= right; i++) {
            queue.add(nums[i]);
        }
        while (right < nums.length) {
            maxNums[left] = queue.peek();
            queue.remove(nums[left]);
            left++;
            right++;
            queue.add(nums[right]);
        }
        return maxNums;
    }*/

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return nums;
        }
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            if (i - k >= 0 && nums[i - k] == deque.peekFirst()) {
                deque.pollFirst();
            }
            //如果我在你后面，而且我比你大，那就不需要保留你了，因为轮到我被删除之前，你已经被删除了
            //将滑动窗口的最大值放置在双端队列的第一位
            while (deque.size() > 0 && nums[i] > deque.peekLast()) {
                deque.pollLast();
            }
            deque.add(nums[i]);
            if (i - k + 1 >= 0) {
                res[i - k + 1] = deque.peekFirst();
            }
        }
        return res;
    }
    
    /*public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return nums;
        }
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            while (deque.size() > 0 && nums[i] > deque.peekLast()) {
                deque.pollLast();
            }
            deque.add(nums[i]);
        }
        res[0] = deque.peekFirst();
        for (int i = k; i < nums.length; i++) {
            if (nums[i - k] == deque.peekFirst()) {
                deque.pollFirst();
            }
            while (deque.size() > 0 && nums[i] > deque.peekLast()) {
                deque.pollLast();
            }
            deque.add(nums[i]);
            res[i - k + 1] = deque.peekFirst();
        }
        return res;
    }*/

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        new Solution16().maxSlidingWindow(nums, 3);
    }
}
