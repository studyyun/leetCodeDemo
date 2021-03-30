package OneHundredAndSixtyNine;

public class Solution {

    public int majorityElement(int[] nums) {
        int count = 0;
        int maj = 0;
        int length = nums.length / 2;
        for (int num : nums) {

            if (count > length){
                return maj;
            }

            if (count == 0){
                maj = num;
                count++;
                continue;
            }

            if (maj == num){
                count++;
            }else {
                count--;
            }
        }

        return maj;
    }

}
