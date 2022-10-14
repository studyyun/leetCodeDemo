package SwordFinger.ThirtyTwo.I;

import SwordFinger.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-30  9:08
 */
public class Review {

    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);
        List<Integer> list = new ArrayList<>();
        while (!deque.isEmpty()) {
            TreeNode node = deque.pollFirst();
            assert node != null;
            list.add(node.val);
            if (node.left != null) {
                deque.addLast(node.left);
            }
            if (node.right != null) {
                deque.addLast(node.right);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
