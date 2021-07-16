package SwordFinger.ThirtySix;


/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-07-16  8:20
 */
public class Solution {
    
    Node pre,head;
    
    public Node treeToDoublyList(Node root) {
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    public void dfs(Node cur) {
        if (cur == null) {
            return;
        }
        dfs(cur.left);
        if (pre == null) {
            head = cur;
        }else {
            pre.right = cur;
        }
        cur.left = pre;
        pre = cur;
        dfs(cur.right);
    }

    public static void main(String[] args) {
        Node node = new Node(4, new Node(2, new Node(1), new Node(3)), new Node(5));

        Node node1 = new Solution().treeToDoublyList(node);
//        System.out.println(node1);
    }
}
