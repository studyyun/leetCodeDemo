package Review;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-03-15  11:10
 */
public class Solution20 {
    
    
    
}

class MaxQueue {
    
    private Queue<Integer> queue;
    private Deque<Integer> maxQueue;
    
    public MaxQueue() {
        queue = new LinkedBlockingQueue<>();
        maxQueue = new LinkedList<>();
    }

    public int max_value() {
        return maxQueue.size() == 0 ? -1 : maxQueue.peekFirst();
    }

    public void push_back(int value) {
        queue.add(value);
        while (maxQueue.size() > 0 && maxQueue.peekLast() < value) {
            maxQueue.pollLast();
        }
        maxQueue.addLast(value);
    }

    public int pop_front() {
        Integer i = queue.size() == 0 ? -1 : queue.poll();
        if (i.equals(maxQueue.peekFirst())) {
            maxQueue.pollFirst();
        }
        return i;
    }
}
