package SwordFinger.FortyOne;

import java.util.PriorityQueue;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-09-20  9:15
 */
public class Review {

    //小根堆
    private PriorityQueue<Integer> smallQueue;
    //大根堆
    private PriorityQueue<Integer> bigQueue;

    public Review() {
        smallQueue = new PriorityQueue<>();
        bigQueue = new PriorityQueue<Integer>((i1, i2) -> {
            return i2 - i1;
        });
    }

    public void addNum(int num) {
        //调转一下之后，保持小根堆里面都是较大的那一半数据，大根堆里面都是较小的那一半数据。
        //那么中位数的两个数就是：小根堆的头部(较大一半数据中的最小值) 和 大根堆的头部(较小一半数据中的最大值)
        if (smallQueue.size() == bigQueue.size()) {
            bigQueue.add(num);
            smallQueue.add(bigQueue.poll());
        } else {
            smallQueue.add(num);
            bigQueue.add(smallQueue.poll());
        }
    }

    public double findMedian() {
        if (smallQueue.size() == 0) {
            return 0;
        } else if (bigQueue.size() == 0) {
            return smallQueue.peek();
        } else {
            return smallQueue.size() == bigQueue.size() ? (smallQueue.peek() + bigQueue.peek()) / 2.0 : smallQueue.peek();
        }
    }

}
