package TwoHundredAndThirtyFour;

public class Solution2 {

    public boolean isPalindrome(ListNode head) {
        if(head.next == null){
            return true;
        }

        ListNode fast = head;
        ListNode pre = null;

        // 快慢指针的应用：可以帮我们找到链表的中间节点！！！
        // 当快节点走完时，慢节点正好在中间的位置，不过要注意奇数节点和偶数节点的情况
        // 第141题是快慢指针的另外一种应用，可以判断当前链表是否为环形链表
        while(fast!=null && fast.next != null){

            fast = fast.next.next;
            ListNode node2 = head.next;
            head.next = pre;
            pre = head;
            head = node2;

        }

        // 如果当前链表节点数是奇数个
        if(fast != null){
            head = head.next;
        }

        while(pre!=null && head!=null){
            if(pre.val != head.val){
                return false;
            }

            pre = pre.next;
            head = head.next;
        }

        return true;


    }

}
