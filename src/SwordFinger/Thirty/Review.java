package SwordFinger.Thirty;

import java.util.Stack;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-30  8:29
 */
public class Review {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public Review() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || minStack.peek() >= x) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        if (minStack.peek().equals(stack.pop())) {
            minStack.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()) {
            return 0;
        }
        return stack.peek();
    }

    public int min() {
        return minStack.isEmpty() ? 0 : minStack.peek();
    }

}
