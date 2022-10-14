package SwordFinger.Seven;

import SwordFinger.TreeNode;

import java.util.HashMap;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-08  16:51
 */
public class Review {

    private HashMap<Integer, Integer> map = new HashMap<>();
    private int[] preorders;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorders = preorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return recursion(0, 0, preorder.length - 1);
    }

    public TreeNode recursion(int root, int left, int right) {
        if (left > right) {
            return null;
        }
        TreeNode node = new TreeNode(preorders[root]);
        Integer i = map.get(preorders[root]);
        node.left = recursion(root + 1, left, i - 1);
        node.right = recursion(root + (i - left) + 1, i +1, right);
        return node;


    }

    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode node = new Review().buildTree(preorder, inorder);
        int i = 0;
    }

}
