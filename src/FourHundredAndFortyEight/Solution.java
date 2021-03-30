package FourHundredAndFortyEight;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        for (int i : nums) {
            nums[Math.abs(i)-1] = -Math.abs(nums[Math.abs(i)-1]);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                list.add(i+1);
            }
        }

        return list;
    }


    public static void main(String[] args) {

        /*List<Integer> list = new ArrayList<>(6);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(8);
        list.add(2);
        list.add(3);
        list.add(1);*/
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> disappearedNumbers = new Solution().findDisappearedNumbers(nums);
        disappearedNumbers.forEach(System.out::println);
    }

}
