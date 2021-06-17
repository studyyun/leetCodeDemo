package SwordFinger.Six;

import SwordFinger.ListNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-17  8:27
 */
public class Solution {

    public int[] reversePrint(ListNode head) {
        int count = 0;
        ListNode prev = null;
        while (head != null) {
            ListNode node = head.next;
            head.next = prev;
            prev = head;
            head = node;
            count++;
        }

        int[] arr = new int[count];
        int i = 0;
        while (prev != null){
            arr[i++] = prev.val;
            prev = prev.next;
        }

        return arr;
    }
    
}
