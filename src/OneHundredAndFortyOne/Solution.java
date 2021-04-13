package OneHundredAndFortyOne;

public class Solution {

    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (true){

            if (fast.next == null || fast.next.next == null){
                return false;
            }

            // 快慢指针，一个指针快，一个指针慢，如果是环形，那么迟早可以碰上(龟兔赛跑)
            // 第234题是快慢指针的另外一种应用，可以帮我们找到链表的中间节点(当快指针走完时，慢指针指向的就是中间节点)
            slow = slow.next;
            fast = fast.next.next;

            if (slow.val == fast.val){
                return true;
            }

        }

    }

}
