package SwordFinger.FiftyTwo;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-10-19  9:28
 */
public class Review {

    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1 = headA;
        ListNode node2 = headB;
        // 例：比较5的后面和3的后面，那就比较 5 + 3  和 3 + 5，这样从前往后就可以比较上
        // 相等，包含都为空的情况。
        while (node1 != node2) {

            node1 = node1 == null ? headB : node1.next;
            node2 = node2 == null ? headA : node2.next;
            
        }
        
        return node1;
    }
    
}
