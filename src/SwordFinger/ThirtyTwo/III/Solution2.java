package SwordFinger.ThirtyTwo.III;

import SwordFinger.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-07-02  8:29
 */
public class Solution2 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        LinkedBlockingDeque<TreeNode> queue = new LinkedBlockingDeque<TreeNode>() {{
            add(root);
        }};
        //双端列表这里太好用了，不用考虑双端队列那么多，双端队列容易把自己绕晕
        List<List<Integer>> resultLists = new LinkedList<>();

        while (queue.size() > 0) {
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if ((resultLists.size() & 1) == 0) {
                    list.addLast(node.val);
                }else {
                    list.addFirst(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            resultLists.add(list);
        }

        return resultLists;
    }

    public static void main(String[] args) {
        System.out.println(4 & 1);
    }

}
