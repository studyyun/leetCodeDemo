package NinetyFour;

import SwordFinger.TreeNode;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-01-21  9:11
 */
public class Solution2 {
    
    private List<Integer> list = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (!stack.isEmpty() || root != null) {
            /*if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode pop = stack.pop();
                list.add(pop.val);
                root = pop.right;
            } */
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode pop = stack.pop();
            list.add(pop.val);
            root = pop.right;
        }
        return list;
    }


    public static void main(String[] args) {
        TreeNode node = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));
        new Solution2().inorderTraversal(node);
    }
}
