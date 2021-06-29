package SwordFinger.TwentySix;

import SwordFinger.TreeNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-28  8:38
 */
public class Solution {

    private boolean start = false;

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B == null){
            return false;
        }
        return recursion(A, B);
    }

    private boolean recursion(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null) {
            return false;
        }
        if (A.val == B.val) {
            //标记已经找到第一个相同的节点，开始进行对比
            start = true;
            boolean flag = recursion(A.left, B.left) && recursion(A.right, B.right);
            if (flag){
                return true;
            }

        }
        //回溯，如果已经开始对比，但是有节点的值不相等，就回溯
        if (start) {
            start = false;
            return false;
        }
        
        return recursion(A.left, B) || recursion(A.right, B);
    }
    

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(4, new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(5,new TreeNode(1),null));
        TreeNode treeNode2 = new TreeNode(5,new TreeNode(1),null);
        System.out.println(new Solution().isSubStructure(treeNode1, treeNode2));
    }

}
