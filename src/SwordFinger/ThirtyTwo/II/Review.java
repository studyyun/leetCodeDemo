package SwordFinger.ThirtyTwo.II;

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addLast(root);
        List<List<Integer>> resList = new ArrayList<>();
        int count = 0;
        while (!deque.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            count = deque.size();
            while (count-- > 0) {
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
            resList.add(list);
        }

        return resList;
    }

}
