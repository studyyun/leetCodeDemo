package SwordFinger.Fourteen.I;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-22  9:20
 */
public class Solution2 {

    public int cuttingRope(int n) {

        if (n <= 3) {
            return n - 1;
        }
        
        int a = n % 3;
        int b = n / 3;
        if (a == 0){
            return (int) Math.pow(3,b);
        }else if (a == 1){
            return (int) (Math.pow(3,(b - 1)) * 4);
        }else {
            return (int) (Math.pow(3,b) * 2);
        }
    }

    public static void main(String[] args) {

        System.out.println(Math.pow(3,3));
        
//        System.out.println(new Solution2().cuttingRope(10));
    }
}
