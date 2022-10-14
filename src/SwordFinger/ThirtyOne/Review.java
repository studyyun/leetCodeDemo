package SwordFinger.ThirtyOne;

import java.util.Stack;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-30  8:55
 */
public class Review {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i : pushed) {
            stack.push(i);
            while (!stack.isEmpty() && stack.peek().equals(popped[index])) {
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }

}
