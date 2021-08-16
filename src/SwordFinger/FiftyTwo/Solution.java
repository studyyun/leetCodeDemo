package SwordFinger.FiftyTwo;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-08-16  10:18
 */
public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        
        while (nodeA != nodeB) {
            nodeA = nodeA == null ? headB : nodeA.next;    
            nodeB = nodeB == null ? headA : nodeB.next;    
        }
        
        return nodeA;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
