package SwordFinger.ThirtyTwo.III;

import SwordFinger.TreeNode;

import java.util.ArrayList;
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
        List<List<Integer>> resultLists = new LinkedList<>();

        while (queue.size() > 0) {
            
        }

        return resultLists;
    }

    public static void main(String[] args) {
        System.out.println(4 & 1);
    }

}
