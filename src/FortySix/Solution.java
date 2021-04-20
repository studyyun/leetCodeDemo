package FortySix;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {

    //回溯法
    public List<List<Integer>> permute(int[] nums) {

        int length = nums.length;

        if (length == 0){
            return null;
        }

        List<List<Integer>> resultList = new ArrayList<>();

        Deque<Integer> stack = new ArrayDeque<Integer>();

        boolean[] used = new boolean[length];

        des(resultList,stack,used,0,length,nums);

        return resultList;
    }

    private void des(List<List<Integer>> resultList, Deque<Integer> stack, boolean[] used, int depth, int length, int[] nums) {

        if (depth == length){
            resultList.add(new ArrayList<>(stack));
            return;
        }

        for (int i = 0; i < length; i++) {
            if (used[i]){
                continue;
            }

            //这里的used布尔数组对应的就是原数组第几位是否被选择
            stack.addLast(nums[i]);
            used[i] = true;
            depth++;


            des(resultList, stack, used, depth, length, nums);

            //回溯法的回溯，就是把改变的反向改变回去嘛
            stack.removeLast();
            used[i] = false;
            depth--;
        }

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        new Solution().permute(nums);
    }


}
