package SwordFinger.Fifteen;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-17  9:12
 */
public class Review {
    // 00000000000000000000000000001011
    /*public int hammingWeight(int n) {
        int num = 0;
        while (n != 0) {
            num += (n & 1);
            n = n >>> 1;
        }
        return num;
    }*/

    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0) {
            res++;
            n &= n - 1;
        }
        return res;
    }

    public static void main(String[] args) {
//        System.out.println(Integer.toBinaryString(-3));
        System.out.println(new Review().hammingWeight(4));
    }

}
