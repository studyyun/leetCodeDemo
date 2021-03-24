package SixHundredAndSeventeen;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Solution2 {

    /**
     * 广度优先算法
     *
     * @param root1 第一棵二叉树
     * @param root2 第二棵二叉树
     * @return 合并后的二叉树
     */
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        if (root1 == null || root2 == null) {
            return root1 == null ? root2 : root1;
        }

        Queue<TreeNode> mergeQueue = new LinkedBlockingQueue<>();
        Queue<TreeNode> root1Queue = new LinkedBlockingQueue<>();
        Queue<TreeNode> root2Queue = new LinkedBlockingQueue<>();

        TreeNode mergeRoot = new TreeNode(root1.val + root2.val);
        mergeQueue.offer(mergeRoot);
        root1Queue.offer(root1);
        root2Queue.offer(root2);

        while (mergeQueue.peek() != null) {
            TreeNode r1 = root1Queue.poll();
            TreeNode r1Left = r1 == null ? null : r1.left;
            TreeNode r1Right = r1 == null ? null : r1.right;

            TreeNode r2 = root2Queue.poll();
            TreeNode r2Left = r2 == null ? null : r2.left;
            TreeNode r2Right = r2 == null ? null : r2.right;

            TreeNode mergeNode = mergeQueue.poll();
            assert mergeNode != null;
            if (r1Left != null && r2Left != null) {
                mergeNode.left = new TreeNode(r1Left.val + r2Left.val);
                mergeQueue.offer(mergeNode.left);
                root1Queue.offer(r1Left);
                root2Queue.offer(r2Left);
            } else if (r1Left != null) {
                mergeNode.left = r1Left;
            } else if (r2Left != null) {
                mergeNode.left = r2Left;
            }


            if (r1Right != null && r2Right != null) {
                mergeNode.right = new TreeNode(r1Right.val + r2Right.val);
                mergeQueue.offer(mergeNode.right);
                root1Queue.offer(r1Right);
                root2Queue.offer(r2Right);
            } else if (r1Right != null) {
                mergeNode.right = r1Right;
            } else if (r2Right != null) {
                mergeNode.right = r2Right;
            }



            /*TreeNode r1 = root1Queue.poll();

            TreeNode r2 = root2Queue.poll();

            if (r1 != null && r2 != null){
                TreeNode mergeNode = mergeQueue.poll();
                TreeNode r1Left = r1.left;
                TreeNode r1Right = r1.right;

                TreeNode r2Left = r2.left;
                TreeNode r2Right = r2.right;

//                assert mergeNode != null;
                mergeNode.left = new TreeNode(r1Left.val + r2Left.val);
                mergeNode.right = new TreeNode(r1Right.val + r2Right.val);

                mergeQueue.offer(mergeNode.left);
                mergeQueue.offer(mergeNode.right);

            }

            if (r1 != null){

            }*/

        }
        return mergeRoot;
    }

}
