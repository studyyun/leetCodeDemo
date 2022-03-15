package Review;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-03-15  14:22
 */
public class Solution21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode();
        ListNode resNode = node;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        node.next = list1 == null ? list2 : list1;
        return resNode.next;
    }

}
