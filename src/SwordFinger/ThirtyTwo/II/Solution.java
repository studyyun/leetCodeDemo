package SwordFinger.ThirtyTwo.II;

import SwordFinger.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-07-01  8:40
 */
public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        //匿名内部类进行初始化
        Queue<TreeNode> queue = new LinkedBlockingQueue<TreeNode>(){{
            add(root);
        }};

        List<List<Integer>> list = new ArrayList<>();

        while (queue.size() > 0) {
            List<Integer> list1 = new ArrayList<Integer>();
            //这样倒着遍历，就不会受到queue大小改变的影响，绝了
            //for循环只会执行一次初始化
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                list1.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            list.add(list1);

        }
        return list;
    }

}
