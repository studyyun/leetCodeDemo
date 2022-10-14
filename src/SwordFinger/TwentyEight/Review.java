package SwordFinger.TwentyEight;

import SwordFinger.TreeNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-29  8:31
 */
public class Review {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else {
            if (left.val != right.val) {
                return false;
            }
            return dfs(left.left, right.right) && dfs(left.right, right.left);
        }
    }

}
