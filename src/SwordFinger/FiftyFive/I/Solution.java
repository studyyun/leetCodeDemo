package SwordFinger.FiftyFive.I;

import SwordFinger.TreeNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-11-12  9:23
 */
public class Solution {

    private int max;

    public int maxDepth(TreeNode root) {
        dfs(root, 0);
        return max;
    }

    private void dfs(TreeNode node, int floor) {
        if (node == null) {
            return;
        }
        max = Math.max(max, ++floor);
        dfs(node.left, floor);
        dfs(node.right, floor);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4));
        System.out.println(new Solution().maxDepth(root));
    }
}
