package SwordFinger.FiftyFive.II;

import SwordFinger.TreeNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-11-12  9:36
 */
public class Solution {
    
    public boolean isBalanced(TreeNode root) {
        int result = dfs(root, 0);
        return result != -1;
    }

    /**
     * 
     * @param node  节点
     * @param depth 层级
     * @return  该节点的左右子树中最大的层级数
     */
    private int dfs(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }
        //层级每层加1
        depth++;
        //获取左子树节点中最大的层级数
        int left = dfs(node.left, depth);
        if (left == -1) {
            return -1;
        }
        //获取右子树节点中最大的层级数
        int right = dfs(node.right, depth);
        if (right == -1) {
            return -1;
        }
        //比较左右子树节点中最大的层级数
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        //该节点最大的层级数等于左右子树节点中最大的层级数
        return Math.max(left, right);
    }
    
}
