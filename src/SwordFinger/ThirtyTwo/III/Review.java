package SwordFinger.ThirtyTwo.III;

import SwordFinger.TreeNode;

import java.util.*;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-30  9:08
 */
public class Review {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);
        List<List<Integer>> resList = new ArrayList<>();
        while (!deque.isEmpty()) {
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = deque.size(); i > 0; i--) {
                TreeNode node = deque.pollFirst();
                assert node != null;
                if ((resList.size() & 1) == 0) {
                    list.addLast(node.val);
                } else {
                    list.addFirst(node.val);
                }
                if (node.left != null) {
                    deque.addLast(node.left);
                }
                if (node.right != null) {
                    deque.addLast(node.right);
                }
            }
            resList.add(list);
        }
        return resList;
    }

}
