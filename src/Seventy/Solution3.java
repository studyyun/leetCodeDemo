package Seventy;

public class Solution3 {

    //第一种解法的优化，绝了，其实跟手算一个个加上去差不多。。。（斐波那契数）
    public int climbStairs(int n) {
        int[] intArr = new int[n + 1];
        intArr[0] = 1;
        intArr[1] = 1;

        for (int i = 2; i <= n; i++) {
            intArr[i] = intArr[i - 1] + intArr[i - 2];
        }
        return intArr[n];
    }

    public static void main(String[] args) {
        //1836311903
        System.out.println(new Solution().climbStairs(45));
    }
}
