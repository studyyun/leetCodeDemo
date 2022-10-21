package SwordFinger.FiftyFive.II;

import SwordFinger.TreeNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-10-21  8:47
 */
public class Review {

    private boolean res = true;

    public boolean isBalanced(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    private int dfs(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        depth++;
        int left = dfs(root.left, depth);
        if (!res) {
            return 1;
        }
        int right = dfs(root.right, depth);
        if (!res) {
            return 1;
        }
        res = Math.abs(left - right) <= 1;
        return Math.max(left, right);
    }
    
}
