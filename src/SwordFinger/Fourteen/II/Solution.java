package SwordFinger.Fourteen.II;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-23  8:46
 */
public class Solution {

    public int cuttingRope(int n) {
        if (n <= 3) {
            return n - 1;
        }

        int a = n % 3;
        int b = n / 3;
        long result = 1;
        int mod = 1000000007;
        for (int i = 0; i < b - 1; i++) {
            result = result * 3 % mod;
        }
        if (a == 0){
            return (int) (result * 3 % mod);
        }else if (a == 1){
            return (int) (result * 4 % mod);
        }else {
            return (int) (result * 3 * 2 % mod);
        }
        
    }

    public static void main(String[] args) {
        System.out.println(new Solution().cuttingRope(1000));
        System.out.println(7412080755407364L % 1000000007);
        System.out.println((1000000007L * 1000000007L) % 1000000007L);
        System.out.println(Math.pow(2,63));
    }
    
}
