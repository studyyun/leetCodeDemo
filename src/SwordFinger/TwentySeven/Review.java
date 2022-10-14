package SwordFinger.TwentySeven;

import SwordFinger.TreeNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-29  8:24
 */
public class Review {

    public TreeNode mirrorTree(TreeNode root) {
        dfs(root);
        return root;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            return;
        }

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        dfs(node.left);
        dfs(node.right);
    }

}
