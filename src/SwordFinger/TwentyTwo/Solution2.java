package SwordFinger.TwentyTwo;

import SwordFinger.ListNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-28  8:53
 */
public class Solution2 {

    public ListNode getKthFromEnd(ListNode head, int k) {

        /*ListNode fastNode = head, lowNode = head;
        int count = 0, num = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        num = count - k;
        
        while (num > 0){
            fastNode = fastNode.next;
            num--;
        }
        return fastNode;*/

        ListNode fastNode = head, lowNode = head;
        while (k != 0) {
            fastNode = fastNode.next;
            k--;
        }

        while (fastNode != null) {
            fastNode = fastNode.next;
            lowNode = lowNode.next;
        }
        return lowNode;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        new Solution2().getKthFromEnd(head, 0);

    }

}
