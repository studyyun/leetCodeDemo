package SwordFinger.Thirty;

import java.util.Stack;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-29  8:29
 */
public class MinStack {

    /** initialize your data structure here. */
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if (minStack.size() == 0 || minStack.peek() >= x){
            minStack.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        Integer pop = stack.pop();
        if (pop.equals(minStack.peek())){
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
