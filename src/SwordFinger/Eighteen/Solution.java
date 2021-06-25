package SwordFinger.Eighteen;

import SwordFinger.ListNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-25  9:44
 */
public class Solution {

    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        }
        ListNode node = head;

        while (head != null) {
            if (head.next != null && head.next.val == val) {

                head.next = head.next.next;
                return node;
            }

            head = head.next;
        }
        return node;
    }

}
