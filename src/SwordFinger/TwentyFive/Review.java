package SwordFinger.TwentyFive;

import SwordFinger.ListNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-25  8:06
 */
public class Review {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(-1);
        ListNode res = node;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        node.next = l1 == null ? l2 : l1;
        return res.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode node2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        new Review().mergeTwoLists(node1, node2);
    }

}
