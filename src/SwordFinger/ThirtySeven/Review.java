package SwordFinger.ThirtySeven;

import SwordFinger.ThirtySix.Node;
import SwordFinger.TreeNode;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-09-13  8:30
 */
public class Review {

    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder strBuilder = new StringBuilder();
        Queue<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            TreeNode node = deque.poll();
            if (node == null) {
                strBuilder.append("*#");
            } else {
                strBuilder.append(node.val);
                strBuilder.append("#");
                deque.add(node.left);
                deque.add(node.right);
            }
        }

        return strBuilder.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if ("".equals(data)) {
            return null;
        }
        String[] split = data.split("#");
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        TreeNode root = new TreeNode(Integer.parseInt(split[0]));
        queue.add(root);
        for (int i = 1; i < split.length; i++) {
            TreeNode poll = queue.poll();
            String s = split[i];
            if (!"*".equals(s)) {
                TreeNode left = new TreeNode(Integer.parseInt(s));
                poll.left = left;
                queue.add(left);
            }

            s = split[++i];
            if (!"*".equals(s)) {
                TreeNode right = new TreeNode(Integer.parseInt(s));
                poll.right = right;
                queue.add(right);
            }
        }

        return root;
    }

    public static void main(String[] args) {
//        TreeNode node = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));
        TreeNode node = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        String s = new Review().serialize(node);
        System.out.println(s);
        String[] split = s.split("#");
        Arrays.stream(split).forEach(System.out::print);

        TreeNode treeNode = new Review().deserialize(s);
        int i = 0;
    }


}
