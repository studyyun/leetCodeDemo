package SwordFinger.ThirtyFive;

import SwordFinger.Node;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-09-07  9:01
 */
public class Review2 {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node cur = head;
        while (cur != null) {
            Node temp = cur.next;
            cur.next = new Node(cur.val);
            cur.next.next = temp;
            cur = temp;
        }

        cur = head;
        while (cur != null) {
            cur.next.random = cur.random == null ? null : cur.random.next;
            cur = cur.next.next;
        }

        cur = head;
        Node node = cur.next;
        Node res = node;

        while (cur != null) {
            cur.next = cur.next.next;
            node.next = node.next == null ? null : node.next.next;
            cur = cur.next;
            node = node.next;
        }

        return res;

    }

}
