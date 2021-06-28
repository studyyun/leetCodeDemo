package SwordFinger.TwentyTwo;

import SwordFinger.ListNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-28  8:53
 */
public class Solution {

    public ListNode getKthFromEnd(ListNode head, int k) {

        ListNode prev = null;
        ListNode last = null;
        int count = 0;

        while (head != null) {
            ListNode node = head.next;
            head.next = prev;
            prev = head;
            head = node;
        }

        while (count != k){

            ListNode node = prev.next;
            prev.next = last;
            last = prev;
            prev = node;
            count++;
        }
        
        return last;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        new Solution().getKthFromEnd(head, 0);

    }

}
