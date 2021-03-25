package Seventy;

public class Solution {

    public int[] intArr = new int[100];

    //动态规划，有记忆的递归，解决重复递归导致的执行用时过长问题
    public int climbStairs(int n) {

        if (n == 0 || n == 1) {
            intArr[0] = 1;
            return 1;
        }

        if (intArr[n - 1] == 0) {
            intArr[n - 1] = climbStairs(n - 1);
        }

        return intArr[n - 1] + intArr[n - 2];

    }

    public static void main(String[] args) {
        //1836311903
        System.out.println(new Solution().climbStairs(45));
    }
}
