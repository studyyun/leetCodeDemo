package SwordFinger.ThirtySeven;

import SwordFinger.TreeNode;

import java.util.*;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-12-01  9:05
 */
public class Solution {

    public String serialize(TreeNode root) {
        if(root == null){
            return "";
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<String> res = new ArrayList<>();
        while (queue.size() > 0) {
            TreeNode node = queue.pollFirst();
            if (node != null) {
                res.add(String.valueOf(node.val));
                queue.addLast(node.left);
                queue.addLast(node.right);
            } else {
                res.add("null");
            }

        }
        return "[" + String.join(",", res) + "]";
    }

    public TreeNode deserialize(String data) {
        if (data.length() == 0 || "[]".equals(data)) {
            return null;
        }
        String[] strs = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(strs[0]));
        Deque<TreeNode> deque = new LinkedList<TreeNode>(){{add(root);}};
        int i = 1;
        while (deque.size() > 0) {
            TreeNode node = deque.pollFirst();
            if (!"null".equals(strs[i])) {
                TreeNode left = new TreeNode(Integer.parseInt(strs[i]));
                node.left = left;
                deque.add(left);
            }
            i++;

            if (!"null".equals(strs[i])) {
                TreeNode right = new TreeNode(Integer.parseInt(strs[i]));
                node.right = right;
                deque.add(right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
//        TreeNode treeNode1 = new TreeNode(4, new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(5,new TreeNode(1),null));
        TreeNode treeNode1 = new TreeNode(1,new TreeNode(2,new TreeNode(3,new TreeNode(4,null,null),null), null), null);
        TreeNode treeNode2 = new TreeNode(1,new TreeNode(2), new TreeNode(3));
        System.out.println(new Solution().serialize(treeNode1));
        System.out.println(new Solution().serialize(treeNode2));
    }
}
