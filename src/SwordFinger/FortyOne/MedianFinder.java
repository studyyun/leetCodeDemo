package SwordFinger.FortyOne;

import java.util.PriorityQueue;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-12-07  9:12
 */
public class MedianFinder {
    
    private PriorityQueue<Integer> smallQue;
    private PriorityQueue<Integer> bigQue;
    
    /** initialize your data structure here. */
    public MedianFinder() {
        smallQue = new PriorityQueue<>();
        bigQue = new PriorityQueue<>((x1,x2) -> x2 - x1);
    }

    public void addNum(int num) {
        if (smallQue.size() == bigQue.size()) {
            bigQue.add(num);
            smallQue.add(bigQue.poll());
        } else {
            smallQue.add(num);
            bigQue.add(smallQue.poll());
        }
    }

    public double findMedian() {
        if (smallQue.isEmpty() && bigQue.isEmpty()) {
            return 0;
        } else if (smallQue.isEmpty()) {
            return bigQue.peek();
        } else if (bigQue.isEmpty()) {
            return smallQue.peek();
        } else {
            if (smallQue.size() == bigQue.size()) {
                return (double)(bigQue.peek() + smallQue.peek()) / 2.0;
            }
            return smallQue.peek();
            
        } 
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
