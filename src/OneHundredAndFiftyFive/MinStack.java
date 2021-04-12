package OneHundredAndFiftyFive;

import java.util.Stack;

public class MinStack {

    //存放差值，非常巧妙
    private Stack<Long> stack;
    private int min;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        this.stack = new Stack<>();
    }

    public void push(int val) {

        if (stack.size() == 0) {
            stack.push(0L);
            min = val;
        } else {
            //这里用long，是为了防止超出int的范围报错
            stack.push((long) val - min);
            min = Math.min(val, min);
        }

    }

    public void pop() {
        Long diff = stack.pop();
        //差值小于0，说明min是变化了的，所以需要反向变化回去
        if (diff < 0) {
            min = (int) (min - diff);
        }
    }

    public int top() {
        Long peek = stack.peek();
        if (peek >= 0){
            return (int) (min + peek);
        }else {
            return min;
        }
    }

    public int getMin() {
        return min;
    }

}
