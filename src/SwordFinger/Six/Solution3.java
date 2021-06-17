package SwordFinger.Six;

import SwordFinger.ListNode;

import java.util.Stack;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-17  8:27
 */
public class Solution3 {

    public int[] reversePrint(ListNode head) {
        int count = 0;
        ListNode node = head;
        while (head!=null){
            count++;
            head = head.next;
        }
        int[] arr = new int[count];
        while (node!=null){
            arr[--count] = node.val;
            node = node.next;
        }

        return arr;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        for (int i : new Solution3().reversePrint(head)) {
            System.out.println(i);
        }
    }
}
