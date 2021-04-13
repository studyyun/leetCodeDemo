package FiveHundredAndFortyThree;

public class Solution {

    private int count = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        recursion(root);
        return count;
    }

    private int recursion(TreeNode node){

        if (node == null){
            return 0;
        }

        //左子节点的深度
        int left = recursion(node.left);
        //右子节点的深度
        int right = recursion(node.right);
        //当前节点的直径 = 左子节点的深度 + 右子节点的深度
        count = Math.max(count,left+right);

        //返回当前节点的深度
        return Math.max(left,right) + 1;

    }

}
