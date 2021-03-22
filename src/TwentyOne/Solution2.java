package TwentyOne;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-03-08  20:04
 */
public class Solution2 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null){
            return l2;
        }else if (l2 == null){
            return l1;
        }else if (l1.val <= l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        l1.next = new ListNode(2,new ListNode(4));
        l2.next = new ListNode(3,new ListNode(4));
        ListNode listNode = Solution2.mergeTwoLists(l1, l2);
        for (ListNode i = listNode; i != null; i = i.next) {
            System.out.println(i.val);
        }
        System.out.println(listNode.toString());
    }

}
