package SwordFinger.TwentySix;

import SwordFinger.TreeNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-25  8:25
 */
public class Review {

    public boolean isSubStructure(TreeNode A, TreeNode B) {

        if (A == null || B == null) {
            return false;
        }
        //先序遍历A
        return dfs(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean dfs(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null) {
            return false;
        }
        if (A.val == B.val) {
            return dfs(A.left, B.left) && dfs(A.right, B.right);
        }
        return false;
    }

}
