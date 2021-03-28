package OneHundredAndFour;

public class Solution {

    private int maxCount = 0;

    public int maxDepth(TreeNode root) {

        if (root == null){
            return 0;
        }

        int i = maxDepth(root.left);
        int j = maxDepth(root.right);

        return Math.max(i,j)+1;
    }

}
