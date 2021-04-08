package OneHundredAndTwentyOne;

public class Solution {

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int result = 0;

        for (int i : prices) {

            if (min >= i) {
                min = i;
            }else {
                result = Math.max(result, (i - min));
            }

        }

        return result;
    }

    public static void main(String[] args) {
        int[] prices = {3,5,1,4};
        System.out.println(new Solution().maxProfit(prices));
    }

}
