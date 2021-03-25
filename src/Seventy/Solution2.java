package Seventy;

public class Solution2 {

    //动态规划，类似于滚动数组，将空间复杂度从 O(n)降到了 O(1)
    //和53题类似，都是动态规划，然后通过分析，降低空间复杂度（递归→迭代）
    //详情可见力扣的官方分析
    public int climbStairs(int n) {
        if (n == 1){
            return 1;
        }
        int p = 0,q = 0,r = 1;
        for (int i = 1; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    public static void main(String[] args) {
        //1836311903
        System.out.println(new Solution2().climbStairs(45));
    }

}
