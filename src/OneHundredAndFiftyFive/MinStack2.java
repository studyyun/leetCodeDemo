package OneHundredAndFiftyFive;

import java.util.Stack;

public class MinStack2 {

    //专门用一个栈来存放最小值。
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public MinStack2() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int val) {
        if (minStack.size() == 0 || minStack.peek() >= val){
            minStack.push(val);
        }

        stack.push(val);

    }

    public void pop() {
        if (stack.pop().equals(minStack.peek())){
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
