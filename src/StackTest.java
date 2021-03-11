import java.util.Stack;

public class StackTest {

    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        int length = pushA.length;
        int i = 0;

        for (int j = 0; j < length; j++) {
            stack.push(pushA[j]);
            while (stack.peek() == popA[i]) {
                stack.pop();
                i++;
                if (i == length) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] push = {1,2,3,4,5};
        int[] pop = {4,3,5,1,2};
        System.out.println(IsPopOrder(push,pop));
    }

}
