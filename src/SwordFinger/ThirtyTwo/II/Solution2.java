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
public class Solution2 {
    private List<List<Integer>> list;
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        list = new ArrayList<>();
        dfs(0,root);
        return list;
    }
    
    private void dfs(int level, TreeNode node){
        
        if (node == null){
            return;
        }
        
        if (list.size() == level){
            list.add(new ArrayList<>());
        }
        
        list.get(level).add(node.val);
        dfs(level + 1, node.left);
        dfs(level + 1, node.right);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3, new TreeNode(4, new TreeNode(5), new TreeNode(6)), null);
        new Solution2().levelOrder(node);
    }

}
