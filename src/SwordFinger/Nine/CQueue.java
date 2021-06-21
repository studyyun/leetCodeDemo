package SwordFinger.Nine;

import java.util.Stack;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-21  8:28
 */
public class CQueue {
    
    private Stack<Integer> stackA;
    private Stack<Integer> stackB;
    
    public CQueue() {
        stackA = new Stack<Integer>();
        stackB = new Stack<Integer>();
    }

    public void appendTail(int value) {
        stackA.push(value);
    }

    public int deleteHead() {
        if (stackB.size() > 0){
            return stackB.pop();
        }
        if (stackA.isEmpty()){
            return -1;
        }
        
        while (stackA.size() > 0){
            stackB.push(stackA.pop());
        }
        return stackB.pop();
    }
    
}
