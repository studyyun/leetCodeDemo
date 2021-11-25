package SwordFinger.SixtyEight.I;

import SwordFinger.TreeNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-11-25  9:20
 */
public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
                continue;
            }

            if (p.val > root.val && q.val > root.val) {
                root = root.right;
                continue;
            }
            break;
        }
        
        return root;
    }
    
}
