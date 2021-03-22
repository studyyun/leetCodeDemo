package One;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoNumbers2 {

    private int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //containsKey比containsValue效率高一些
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};

    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        SumOfTwoNumbers2 sumOfTwoNumbers = new SumOfTwoNumbers2();
        int[] ints = sumOfTwoNumbers.twoSum(nums, target);
        for (int i : ints) {
            System.out.println(i);
        }
    }

}
