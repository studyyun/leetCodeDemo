package ThreeHundredAndThirtyEight;

public class Solution {

    public int[] countBits(int num) {

        int[] resultArrs = new int[num+1];
        resultArrs[0] = 0;
        for (int i = 1; i <= num; i++) {
            resultArrs[i] = resultArrs[i & (i-1)] + 1;
        }

        return resultArrs;
    }

    public static void main(String[] args) {
        System.out.println(1 >> 1);
        System.out.println(2 >> 1);
    }

}
