package OneHundredAndOne;

import java.util.Deque;
import java.util.LinkedList;

public class Solution2 {

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return check(p.left,q.right) && check(p.right,q.left);
    }

    public static void main(String[] args) {
        Deque<TreeNode> leftDeque = new LinkedList<>();
        leftDeque.add(null);
        System.out.println(leftDeque.size());
    }

}
