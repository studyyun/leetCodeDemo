package SwordFinger.TwentySeven;

import SwordFinger.TreeNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-29  8:29
 */
public class Solution {

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null){
            return null;
        }
        dfs(root);
        return root;
    }

    private void dfs(TreeNode node) {

        if (node.left == null && node.right == null) {
            return;
        }
        
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        
        if (node.left != null){
            dfs(node.left);
        }

        if (node.right != null){
            dfs(node.right);
        }
    }
}
