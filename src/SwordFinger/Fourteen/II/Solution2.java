package SwordFinger.Fourteen.II;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-23  8:46
 */
public class Solution2 {

    public int cuttingRope(int n) {
        if (n <= 3) {
            return n - 1;
        }

        int a = n % 3;
        int b = n / 3;
        String s = Integer.toBinaryString(b - 1);
        long result = 1;
        long x = 3;
        int mod = 1000000007;
        //根据我们的解法，将每段长度尽量均分为3，假如此时长度为66，那么可以均分为22段绳子，乘积应为3的22次方，
        //但因为每次不一定均分，所以我们提取最后一段出来进行额外的分析，那么先分析21段绳子，这里进行类似二分法进行快速乘积
        for (int i = b - 1; i > 0; i = i >> 1) {
            String s1 = Integer.toBinaryString(i);
            if ((i & 1) == 1){
                //这里相当于将每个乘积叠加起来，21的二进制为10101，那么最后乘积式子应为 (3的1次方) * (3的4次方) * (3的16次方)
                result = (result * x) % mod;
            }
            x = (x * x) % mod;
        }
        //把最后一个长度单独提取出来
        if (a == 0){
            return (int) (result * 3 % mod);
        }else if (a == 1){
            return (int) (result * 4 % mod);
        }else {
            return (int) (result * 3 * 2 % mod);
        }
        
    }

    public static void main(String[] args) {
        System.out.println(new Solution2().cuttingRope(66));
//        System.out.println(7412080755407364L % 1000000007);
//        System.out.println((1000000007L * 1000000007L) % 1000000007L);
        System.out.println(Math.pow(2,63) < (1000000007L * 1000000007L));
    }
    
}
