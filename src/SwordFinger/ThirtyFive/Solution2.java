package SwordFinger.ThirtyFive;

import SwordFinger.Node;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-07-13  8:23
 */
public class Solution2 {

    public Node copyRandomList(Node head) {
        Node cur = head;
        //复制原来的节点 1→1→2→2→3→3
        while (cur != null) {
            Node temp = cur.next;
            cur.next = new Node(cur.val);
            cur.next.next = temp;
            cur = temp;
        }
        cur = head;
        //新节点的随机指针
        while (cur != null) {
            cur.next.random = cur.random == null ? null : cur.random.next;
            cur = cur.next.next;
        }
        
        cur = head;
        Node node = cur.next;
        Node resultNode = node;
        //分离两个链表
        while (cur != null) {
            cur.next = cur.next.next;
            node.next = node.next == null ? null : node.next.next;
            node = node.next;
            cur = cur.next;
            
        }

        return resultNode;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        new Solution2().copyRandomList(node);
    }

}
