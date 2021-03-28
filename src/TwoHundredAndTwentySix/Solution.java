package TwoHundredAndTwentySix;

public class Solution {

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        test(root);

        return root;

    }

    public void test(TreeNode root) {

        TreeNode pre = root.left;
        root.left = root.right;
        root.right = pre;

        if (root.left != null) {
            test(root.left);
        }

        if (root.right != null) {
            test(root.right);
        }
    }


}
