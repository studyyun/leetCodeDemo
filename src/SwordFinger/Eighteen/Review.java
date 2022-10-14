package SwordFinger.Eighteen;

import SwordFinger.ListNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-19  8:47
 */
public class Review {

    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        }
        ListNode node = head;
        while (node != null) {
            if (node.next != null && node.next.val == val) {
                node.next = node.next.next;
                return head;
            }
            node = node.next;
        }
        return head;
    }

}
