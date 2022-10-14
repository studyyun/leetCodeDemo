package SwordFinger.Seven;

import SwordFinger.TreeNode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-18  8:49
 */
public class Solution2 {

    //Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
    //Output: [3,9,20,null,null,15,7]

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        stack.push(root);
        int inorderIndex = 0;
        for (int i = 1; i < preorder.length; i++) {
            int preorderVal = preorder[i];
            TreeNode node = stack.peek();
            //一直走到左下角的底,如果相等，说明已经到底了，那么就开始往上走，并处理右子树
            if (node.val != inorder[inorderIndex]) {
                node.left = new TreeNode(preorderVal);
                stack.push(node.left);
            } else {
                while (!stack.isEmpty() && stack.peek().val == inorder[inorderIndex]) {
                    node = stack.pop();
                    inorderIndex++;
                }
                node.right = new TreeNode(preorderVal);
                stack.push(node.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
//        System.out.println(3 / 0.75 + 1);
//        int[] preorder = {3, 9, 7, 10, 20, 15, 7};
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
//        int[] inorder = {7, 9, 10, 3, 15, 20, 7};
        TreeNode treeNode = new Solution2().buildTree(preorder, inorder);
        System.out.println(treeNode);
    }
}
