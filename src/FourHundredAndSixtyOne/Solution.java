package FourHundredAndSixtyOne;

public class Solution {

    public int hammingDistance(int x, int y) {
        // 与：& 两个1为1   或：| 有1则为1   非：~ 1变0，0变1   异或：^  不相同为1

        int z = x ^ y;

//        return Integer.bitCount(z);


        int count = 0;
        while (z != 0) {
            z = z&(--z);
            count++;

            /*if ((z & 1) == 1) {
                count++;
            }
            z = z >> 1;*/
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().hammingDistance(1, 4));
    }
}
