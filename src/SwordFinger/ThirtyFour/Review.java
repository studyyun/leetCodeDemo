package SwordFinger.ThirtyFour;

import SwordFinger.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-09-06  8:07
 */
public class Review {

    private List<List<Integer>> resList = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root == null) {
            return resList;
        }
        dfs(new ArrayList<>(), root, target);
        return resList;
    }

    private void dfs(List<Integer> res, TreeNode node, int target) {
        if (node == null) {
            return;
        }
        target = target - node.val;
        res.add(node.val);
        if (target == 0 && node.left == null && node.right == null && res.size() > 0) {
            resList.add(new ArrayList<>(res));
            //回溯，方法结束的地方都应该回溯
            res.remove(res.size() - 1);
            return;
        }
        dfs(res, node.left, target);
        dfs(res, node.right, target);
        res.remove(res.size() - 1);
    }


    private boolean dfs2(List<Integer> res, TreeNode node, int target) {
        if (target == 0 && res.size() > 0) {
            resList.add(new ArrayList<>(res));
            return true;
        }
        if (target < 0) {
            return true;
        }
        if (node == null) {
            return false;
        }
        target = target - node.val;
        res.add(node.val);
        boolean flag = dfs2(res, node.left, target);
        if (!flag) {
            dfs(res, node.right, target);
        }
        res.remove(res.size() - 1);
        return false;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1))));

        new Review().pathSum(node,22);
    }

}
