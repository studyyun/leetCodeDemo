package TwoHundredAndThirtyFour;

public class Solution {

    public boolean isPalindrome(ListNode head) {


        if (head.next == null) {
            return true;
        }

        ListNode bakNode = head;
        ListNode node = new ListNode(head.val);
        ListNode pre = null;

        //创建一个新的反向链表，然后跟初始的一个个进行比较
        while (head != null) {

            head = head.next;
            ListNode node2 = head == null ? head : new ListNode(head.val);
            node.next = pre;
            pre = node;
            node = node2;

        }

        while (pre != null) {
            if (pre.val != bakNode.val) {
                return false;
            }

            pre = pre.next;
            bakNode = bakNode.next;
        }

        return true;


    }

    public static void main(String[] args) {
        new Solution().isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1)))));
    }

}
