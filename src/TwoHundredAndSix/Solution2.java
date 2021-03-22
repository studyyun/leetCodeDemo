package TwoHundredAndSix;

public class Solution2 {

    private ListNode reverseList(ListNode head) {

        /*if (head == null){
            return null;
        }
        ListNode resultNode = new ListNode();
        ListNode result = new ListNode();
        cycle(result,resultNode,head);
        return result;*/

        //空间复杂度和栈空间相关联，执行一次方法就会产生一个栈空间，所以递归方法的空间复杂度为  O(n)，n为链表的长度

        if (head == null || head.next == null){
            return head;
        }

        ListNode resultNode = reverseList(head.next);
        // eg: head为4 ， 4→5→4
        head.next.next = head;
        // 4→null，结果 5→4→null    防止循环依赖报错(4→5→4→5→4→5→4......)
        head.next = null;

        return resultNode;
    }

    private ListNode cycle(ListNode result, ListNode resultNode, ListNode head){
        //递归找准结束的时间点很关键
        if (head.next == null){
            result.val = head.val;
            return result;
        }
        //递归会先一直递归到最底层，再从最底层一层层返回结果
        resultNode = cycle(result, resultNode,head.next);
        resultNode.next = new ListNode(head.val);

        return resultNode.next;
    }

    public static void main(String[] args) {
        int i = 5;
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        new Solution2().reverseList(head);

    }

}
