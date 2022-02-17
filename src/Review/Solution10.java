package Review;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-02-17  14:39
 */
public class Solution10 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode head = node;
        int add = 0;
        while (l1 != null || l2 != null) {
            int val = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + add;
            add = val > 9 ? 1 : 0;
            val = val > 9 ? (val - 10) : val;
            node.next = new ListNode(val);
            node = node.next;
            l1 = (l1 == null ? null : l1.next);
            l2 = (l2 == null ? null : l2.next);
        }
        if (add == 1) {
            node.next = new ListNode(1);
        }
        return head.next;
    }

}
