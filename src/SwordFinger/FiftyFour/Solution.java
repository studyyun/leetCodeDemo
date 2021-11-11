package SwordFinger.FiftyFour;

import SwordFinger.TreeNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-11-11  8:53
 */
public class Solution {

    private int num;
    private int res;

    public int kthLargest(TreeNode root, int k) {
        num = k;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode node) {
        if (node == null || num == 0) {
            return;
        }
        dfs(node.right);
        if (--num == 0) {
            res = node.val;
            return;
        }
        dfs(node.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4));
        System.out.println(new Solution().kthLargest(root, 4));
    }
}
