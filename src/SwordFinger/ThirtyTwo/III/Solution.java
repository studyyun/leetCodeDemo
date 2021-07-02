package SwordFinger.ThirtyTwo.III;

import SwordFinger.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-07-02  8:29
 */
public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        LinkedBlockingDeque<TreeNode> queue = new LinkedBlockingDeque<TreeNode>() {{
            add(root);
        }};
        List<List<Integer>> resultLists = new ArrayList<>();

        while (queue.size() > 0) {
            List<Integer> list = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node;
                //不用加个奇偶标识符，可以直接用数组的长度来判断，精妙！
                //感悟：很多时候不需要另外加标识符，可以从别的地方来判断，精简代码！
                if ((resultLists.size() & 1) == 0) {
                    node = queue.pollFirst();
                    assert node != null;
                    list.add(node.val);
                    if (node.left != null) {
                        queue.addLast(node.left);
                    }
                    if (node.right != null) {
                        queue.addLast(node.right);
                    }
                    
                }else {
                    node = queue.pollLast();
                    assert node != null;
                    list.add(node.val);
                    if (node.right != null) {
                        queue.addFirst(node.right);
                    }
                    if (node.left != null) {
                        queue.addFirst(node.left);
                    }
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
