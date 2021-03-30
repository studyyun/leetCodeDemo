package OneHundredAndSixty;

public class Solution {

    public ListNode getIntersectionNode(int intersectVal, ListNode headA, ListNode headB, int skipA, int skipB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode preA = null;
        ListNode preB = null;

        while (headA != null) {
            ListNode node = headA.next;
            headA.next = preA;
            preA = headA;
            headA = node;
        }

        while (headB != null) {
            ListNode node = headB.next;
            headB.next = preB;
            preB = headB;
            headB = node;
        }

        if (preA.val != preB.val) {
            return null;
        }


        while (preA.next != null && preB.next != null && preA.next.val == preB.next.val) {

            preA = preA.next;
            preB = preB.next;


        }

        return new ListNode(preA.val);
    }

}
