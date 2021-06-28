package SwordFinger.TwentyFive;

import SwordFinger.ListNode;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-28  8:38
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode bakNode = new ListNode(-1);
        ListNode resultNode = bakNode;

        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                bakNode.next = l1;
                l1 = l1.next;
            } else {
                bakNode.next = l2;
                l2 = l2.next;
            }
            bakNode = bakNode.next;
        }
        bakNode.next = l1 == null ? l2 : l1;
        return resultNode.next;
    }

}
