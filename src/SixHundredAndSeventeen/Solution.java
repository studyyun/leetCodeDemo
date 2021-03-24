package SixHundredAndSeventeen;

public class Solution {

    /**
     * 深度优先算法
     *
     * @param root1
     * @param root2
     * @return
     */
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        /*
        //会复用原来树的一部分节点
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }

        TreeNode mergeNode = new TreeNode(root1.val + root2.val);
        mergeNode.left = mergeTrees(root1.left, root2.left);
        mergeNode.right = mergeTrees(root1.right, root2.right);
        return mergeNode;*/

        //不会复用原来树的节点，每个节点都是新建的
        if (root1 == null && root2 == null){
            return null;
        }
        int val1 = root1 == null ? 0 : root1.val;
        int val2 = root2 == null ? 0 : root2.val;
        TreeNode mergeNode = new TreeNode(val1 +val2);
        mergeNode.left = mergeTrees(root1 == null ? null : root1.left,root2 == null ? null : root2.left);
        mergeNode.right = mergeTrees(root1 == null ? null : root1.right,root2 == null ? null : root2.right);
        return mergeNode;
    }

}
