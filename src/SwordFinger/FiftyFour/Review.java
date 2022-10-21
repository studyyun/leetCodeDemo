package SwordFinger.FiftyFour;

import SwordFinger.TreeNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-10-21  8:26
 */
public class Review {
    
    private int num, res;
    
    public int kthLargest(TreeNode root, int k) {
        num = k;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.right);
        if (--num <= 0) {
            if (num == 0) {
                res = root.val;
            }
            return;
        }
        dfs(root.left);
    }
    
}
