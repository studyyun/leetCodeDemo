package OneHundredAndThirtySix;

public class Solution {

    //异或运算，两个相同的数异或结果为0，任何一个数和0进行异或结果为其自身
    //异或满足结合律和交换律
    public int singleNumber(int[] nums) {
        int onlyOne = 0;
        for (int num : nums) {
            onlyOne ^= num;
        }

        return onlyOne;

    }

}
