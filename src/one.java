import java.util.LinkedList;

public class one {
    public String reverseLeftWords(String s, int n) {

        StringBuilder stb2 = new StringBuilder(s.substring(n)).append(s.substring(0, n));

        return stb2.toString();
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k < 1 || nums.length < k) {
            return new int[0];
        }
        int[] maxnum = new int[nums.length-k+1];
        int index = 0;
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {

            while (queue.size()!=0 && nums[i] > nums[queue.getLast()]) {
                queue.pollLast();
            }
            queue.add(i);
            if (i-queue.getFirst()==k) {
                queue.removeFirst();
            }
            if (i+1>=k){
                maxnum[index++]=nums[queue.getFirst()];
            }

        }
        return maxnum;
    }


    public static void main(String[] args) {



    }
}
