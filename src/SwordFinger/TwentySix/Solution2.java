package SwordFinger.TwentySix;

import SwordFinger.TreeNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-28  8:38
 */
public class Solution2 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null){
            return false;
        }
        
        return recursion(A, B) || isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }

    private boolean recursion(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null) {
            return false;
        }
        if (A.val == B.val) {
            return recursion(A.left, B.left) && recursion(A.right, B.right);
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(4, new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(5,new TreeNode(1),null));
        TreeNode treeNode2 = new TreeNode(5,new TreeNode(1),null);
        System.out.println(new Solution2().isSubStructure(treeNode1, treeNode2));
    }

}
