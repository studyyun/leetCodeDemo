package SwordFinger.Fourteen.II;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-17  8:07
 */
public class Review {

    //  (xy)%p=[(x%p)(y%p)]%p
    //  如果y<p，则y%p = y
    public int cuttingRope(int n) {
        if(n <= 3){
            return n-1;
        }
        int b = n % 3, num = n / 3;
        long res = 1;
        //少算最后一段长度3的绳子
        for (int i = 1; i <= num - 1; i++) {
            res = res * 3 % 1000000007;
        }
        //如果正好没有多余的
        if (b == 0) {
            return (int) (res * 3 % 1000000007);
        }
        //如果余出来长度1的绳子，加上之前少算的长度3的绳子，总共长度4，分成2*2，所以是乘以4
        if (b == 1) {
            return (int) (res * 4 % 1000000007);
        }
        //如果余出来长度2的绳子，加上之前少算的长度3的绳子，总共长度5，分成3*2，所以是乘以6
        return (int) (res * 6 % 1000000007);
    }

    public static void main(String[] args) {
        System.out.println(new Review().cuttingRope(1000));
        System.out.println(Integer.MAX_VALUE);
    }

}
