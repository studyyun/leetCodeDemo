package FortyTwo;

import java.util.Stack;
import java.util.concurrent.TimeUnit;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-12-29  11:52
 */
public class Solution2 {
    
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int index = 0, res = 0;
        while (index < height.length) {
            //如果一直不进下面的while循环，说明柱子的高度是递减的
            while (stack.size() > 0 && height[index] > height[stack.peek()]) {
                int h = height[stack.pop()];
                if (stack.isEmpty()) {
                    break;
                }
                //代码逻辑到这里，说明当前柱子两侧肯定有更高的柱子，所以当前柱子上面可以存储雨水
                int width = index - stack.peek() - 1;
                //求当前柱子两侧较低的柱子的高度
                int min = Math.min(height[index], height[stack.peek()]);
                //求当前柱子可以存储的雨水
                res += ((min - h) * width);
            }
            stack.push(index);
            index++;
        }
        return res;
    }

    public static void main(String[] args) {
        try {
            TimeUnit.SECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
