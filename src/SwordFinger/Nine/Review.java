package SwordFinger.Nine;

import java.util.Stack;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-10  8:24
 */
public class Review {

    private Stack<Integer> stack;
    private Stack<Integer> stackTwo;

    public Review() {
        stack = new Stack<>();
        stackTwo = new Stack<>();
    }

    // 1 2 3
    public void appendTail(int value) {
        stack.push(value);
    }

    public int deleteHead() {
        if (!stackTwo.isEmpty()) {
            return stackTwo.pop();
        }
        if (stack.isEmpty()) {
            return -1;
        }
        while (!stack.isEmpty()) {
            stackTwo.push(stack.pop());
        }
        return stackTwo.pop();
    }

}
