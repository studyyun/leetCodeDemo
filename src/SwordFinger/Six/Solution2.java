package SwordFinger.Six;

import SwordFinger.ListNode;

import java.util.Stack;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-17  8:27
 */
public class Solution2 {

    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head!=null){
            stack.push(head.val);
            head = head.next;
        }
        int length = stack.size();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = stack.pop();
        }

        return arr;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        for (int i : new Solution2().reversePrint(head)) {
            System.out.println(i);
        }
    }
}
