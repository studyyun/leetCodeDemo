package SwordFinger.ThirtySix;

import java.util.*;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-09-08  8:35
 */
public class Review {

    private List<Node> list = new ArrayList<>();

    public Node treeToDoublyList(Node root) {
        dfs(root);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).right = (i + 1) == list.size() ? list.get(0) : list.get(i + 1);
            list.get(i).left = i == 0 ? list.get(list.size() - 1) : list.get(i - 1);
        }
        return list.get(0);
    }

    private void dfs(Node node) {
        if (node == null) {
            return;
        }

        dfs(node.left);
        list.add(node);
        System.out.println(node.val);
        dfs(node.right);
    }

    public static void main(String[] args) {
        Node node = new Node(4, new Node(2, new Node(1), new Node(3)), new Node(5));
        new Review().treeToDoublyList(node);
    }

}
