package TwoHundredAndSix;

public class Solution {

    private ListNode reverseList(ListNode head) {

        if (head == null){
            return null;
        }

        ListNode listNode = head;
        ListNode node;
        ListNode moveNode;

        node = listNode.next;
        moveNode = new ListNode(listNode.val);
        listNode = node;


        while (listNode != null) {
            node = listNode.next;
            listNode.next = moveNode;
            moveNode = listNode;
            listNode = node;
        }

        return moveNode;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
//        new Solution().reverseList(null);
    }

}
