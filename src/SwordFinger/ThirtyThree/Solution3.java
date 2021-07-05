package SwordFinger.ThirtyThree;

import java.util.Stack;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-07-05  8:58
 */
public class Solution3 {

    public boolean verifyPostorder(int[] postorder) {

        if (postorder.length == 0) {
            return true;
        }

        Stack<Integer> stack = new Stack<>();
        int root = Integer.MAX_VALUE;

        for (int i = postorder.length - 1; i >= 0; i--) {
            //如果左子树中的值大于根节点
            if (postorder[i] > root) {
                return false;
            }
            //这一步是在找左子树，同时过滤了右子树(保证了右子树正确)
            while (stack.size() > 0 && stack.peek() > postorder[i]) {
                //通过左子树去找根节点
                root = stack.pop();
            }

            stack.push(postorder[i]);

        }
        return true;
    }

    public static void main(String[] args) {
        new Solution3().verifyPostorder(new int[]{1, 3, 2, 6, 5});
    }

}
