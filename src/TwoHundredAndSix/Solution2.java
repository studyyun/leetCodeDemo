package TwoHundredAndSix;

public class Solution2 {

    private ListNode reverseList(ListNode head) {

        if (head == null){
            return null;
        }

        ListNode resultNode = new ListNode();
        ListNode result = new ListNode();
        cycle(result,resultNode,head);
        return result;
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
