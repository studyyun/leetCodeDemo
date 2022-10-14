package SwordFinger.ThirtySix;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-09-09  9:06
 */
public class Review2 {

    Node prev, head;

    public Node treeToDoublyList(Node root) {
        dfs(root);
        head.left = prev;
        prev.right = head;
        return head;
    }

    private void dfs(Node cur) {
        if (cur == null) {
            return;
        }
        dfs(cur.left);

        if (prev == null) {
            head = cur;
        } else {
            prev.right = cur;
        }
        cur.left = prev;
        prev = cur;
        dfs(cur.right);
    }

}
