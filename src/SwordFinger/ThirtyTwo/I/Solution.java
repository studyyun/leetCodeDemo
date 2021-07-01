package SwordFinger.ThirtyTwo.I;

import SwordFinger.TreeNode;

import java.util.ArrayList;
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

    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        //匿名内部类进行初始化
        Queue<TreeNode> queue = new LinkedBlockingQueue<TreeNode>(){{
            add(root);
        }};
        
        List<Integer> list = new ArrayList<Integer>();
        
        while (queue.size() > 0) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();

    }

}
