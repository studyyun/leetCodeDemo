package SwordFinger.FiftyFive.I;

import SwordFinger.TreeNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-10-21  8:38
 */
public class Review {
    
    private int res = 0;
    
    public int maxDepth(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        depth++;
        res = Math.max(res, depth);
        dfs(root.left, depth);
        dfs(root.right, depth);
    }

}
