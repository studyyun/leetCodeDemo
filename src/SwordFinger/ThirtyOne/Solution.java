package SwordFinger.ThirtyOne;

import java.util.Stack;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-29  8:29
 */
public class Solution {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int index = 0;
        Stack<Integer> stack = new Stack<>();

        for (int value : pushed) {
            stack.push(value);
            while (stack.size() > 0 && popped[index] == stack.peek()) {
                index++;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
