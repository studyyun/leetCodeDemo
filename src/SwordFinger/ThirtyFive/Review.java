package SwordFinger.ThirtyFive;

import SwordFinger.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-09-07  8:31
 */
public class Review {

    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node bak = head;

        while (bak != null) {
            map.put(bak, new Node(bak.val));
            bak = bak.next;
        }
        bak = head;
        while (bak != null) {
            map.get(bak).next = bak.next == null ? null : map.get(bak.next);
            map.get(bak).random = bak.random == null ? null : map.get(bak.random);
            bak = bak.next;
        }

        return map.get(head);
    }

    public static void main(String[] args) {
        Node node = new Node(7, new Node(13, new Node(11, new Node(10, new Node(1, null)))));
        new Review2().copyRandomList(node);
    }

}
