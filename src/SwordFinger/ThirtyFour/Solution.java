package SwordFinger.ThirtyFour;

import SwordFinger.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-07-06  8:50
 */
public class Solution {

    private List<List<Integer>> resultList;
    private int target;

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root == null) {
            return Collections.emptyList();
        }
        this.resultList = new ArrayList<>();
        this.target = target;

        dfs(0, root, new LinkedList<>());
        return resultList;
    }

    private void dfs(int count, TreeNode node, LinkedList<Integer> list) {
        if (node == null) {
            return;
        }

        list.add(node.val);
        count += node.val;

        if (count == target && node.left == null && node.right == null) {
            resultList.add(new ArrayList<>(list));
            list.removeLast();
            return;
        }

        dfs(count, node.left, list);
        dfs(count, node.right, list);

        list.removeLast();
    }

}
