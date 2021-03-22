package TwoHundredAndSix;

public class Solution {

    private ListNode reverseList(ListNode head) {

        ListNode pre = null;

        while (head != null) {
            ListNode after = head.next;
            head.next = pre;
            pre = head;
            head = after;
        }

        return pre;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
//        new Solution().reverseList(null);
    }

}
