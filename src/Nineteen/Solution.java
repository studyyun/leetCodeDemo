package Nineteen;

import SwordFinger.ListNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-12-20  9:35
 */
public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        ListNode behind, front;
        ListNode res = new ListNode(-1);
//        behind = head;
        behind = res;
        behind.next = head;
        front = behind;
        for (int i = 0; i < n; i++) {
            front = front.next;
        }
        
        while (front.next != null) {
            front = front.next;
            behind = behind.next;
        }
        behind.next = behind.next.next;
        return res.next;
    }
    
}
