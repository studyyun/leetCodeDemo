package OneHundredAndOne;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {

    public boolean isSymmetric(TreeNode root) {

        if (root.left == null && root.right == null) {
            return true;
        }

        Deque<TreeNode> leftDeque = new LinkedList<>();
        Deque<TreeNode> rightDeque = new LinkedList<>();

        leftDeque.add(root.left);
        rightDeque.add(root.right);

        while (leftDeque.size() != 0 && rightDeque.size() != 0) {

            TreeNode node = leftDeque.poll();
            TreeNode node2 = rightDeque.poll();

            if (node == null && node2 == null){
                continue;
            }

            if (node==null || node2 == null || node.val != node2.val){
                return false;
            }

            leftDeque.add(node.left);
            rightDeque.add(node2.right);
            leftDeque.add(node.right);
            rightDeque.add(node2.left);

        }

        return true;
    }

    public static void main(String[] args) {
        Deque<TreeNode> leftDeque = new LinkedList<>();
        leftDeque.add(null);
        System.out.println(leftDeque.size());
    }

}
