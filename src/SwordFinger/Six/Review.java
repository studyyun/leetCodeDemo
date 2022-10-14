package SwordFinger.Six;

import SwordFinger.ListNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-08  16:19
 */
public class Review {

    public int[] reversePrint(ListNode head) {
        ListNode node = null;
        int count = 0;
        while (head != null) {
            ListNode next = head.next;
            head.next = node;
            node = head;
            head = next;
            count++;
        }

        int[] ints = new int[count];
        int i = 0;
        while (node != null) {
            ints[i++] = node.val;
            node = node.next;
        }
        return ints;

    }

}
