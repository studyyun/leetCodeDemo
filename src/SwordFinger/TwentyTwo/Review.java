package SwordFinger.TwentyTwo;

import SwordFinger.ListNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-24  8:48
 */
public class Review {

    public ListNode getKthFromEnd(ListNode head, int k) {

        ListNode node = head;
        int count = 0;

        while (head != null) {
            head = head.next;
            count++;
        }

        count = count - k;

        while (count > 0) {
            node = node.next;
            count--;
        }

        return node;
    }

}
