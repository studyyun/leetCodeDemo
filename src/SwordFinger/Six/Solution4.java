package SwordFinger.Six;

import SwordFinger.ListNode;

import java.util.Set;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-17  8:27
 */
public class Solution4 {
    
    private int[] arrs;
    private int j = 0;
    
    public int[] reversePrint(ListNode head) {
        recursion(head,0);
        return arrs;
    }

    public void recursion(ListNode node, int i) {
        if (node == null){
            arrs = new int[i];
            return;
        }
        recursion(node.next, ++i);
        arrs[j++] = node.val;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        for (int i : new Solution4().reversePrint(head)) {
            System.out.println(i);
        }
        
    }
}
