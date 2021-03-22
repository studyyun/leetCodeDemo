package TwentyOne;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-03-08  20:04
 */
public class Solution {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode merageListNode = new ListNode();
        ListNode nowListNode = merageListNode;

        while (l1 != null && l2 != null){

            if (l1.val <= l2.val ){
                nowListNode.next = l1;
                l1 = l1.next;
            }else {
                nowListNode.next = l2;
                l2 = l2.next;
            }
            nowListNode = nowListNode.next;

        }

        nowListNode.next = l1 == null ? l2 : l1;

        return merageListNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        l1.next = new ListNode(2,new ListNode(4));
        l2.next = new ListNode(3,new ListNode(4));
        ListNode listNode1 = Solution.mergeTwoLists(null, null);
        if (listNode1 == null){
            System.out.println("为空");
        }
        ListNode listNode = Solution.mergeTwoLists(l1, l2);
        for (ListNode i = listNode; i != null; i = i.next) {
            System.out.println(i.val);
        }
    }

}
