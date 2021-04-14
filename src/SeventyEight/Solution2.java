package SeventyEight;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    // 这里很巧妙，用的位运算
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> tempList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    tempList.add(nums[j]);
                }
            }
            resultList.add(tempList);

        }
        return resultList;

    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 9};
        List<List<Integer>> subsets = new Solution2().subsets(nums);
        System.out.println(subsets);

        System.out.println(1 << 3);


    }

}
