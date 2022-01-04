package FortyTwo;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-12-29  11:52
 */
public class Solution {

    public static void main(String[] args) {
        int[] ints = new int[]{4,2,0,3,2,5};
        System.out.println(new Solution().trap(ints));
    }
    
    public int trap(int[] height) {
        if (height.length == 1) {
            return 0;
        }
        int res = 0;
        int left = 1, right = height.length - 2;
        int maxLeft = 0;
        int maxRight = height.length - 1;

        while (left <= right) {
            if (height[maxLeft] < height[maxRight]) {
                if (height[left] < height[maxLeft]) {
                    res += (height[maxLeft] - height[left]);
                } else {
                    maxLeft = left;
                }
                left++;
            } else {
                if (height[right] < height[maxRight]) {
                    res += (height[maxRight] - height[right]);
                } else {
                    maxRight = right;
                }
                right--;
            }
        }
        
        return res;
    }
    
    /*public int trap(int[] height) {
        int res = 0;
        int maxLeft = height[0];
        int[] maxRight = new int[height.length];


        for (int i = maxRight.length - 2; i > 0; i--) {
            maxRight[i] = Math.max(height[i + 1], maxRight[i + 1]);
        }

        for (int i = 1; i < height.length; i++) {
            maxLeft = Math.max(maxLeft, height[i - 1]);
            int min = Math.min(maxLeft, maxRight[i]);
            if (height[i] < min) {
                res += (min - height[i]);
            }
        }

        return res;
    }*/
    
    /*public int trap(int[] height) {
        int res = 0;
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];

        for (int i = 1; i < maxLeft.length; i++) {
            maxLeft[i] = Math.max(height[i - 1], maxLeft[i - 1]);
        }

        for (int i = maxRight.length - 2; i > 0; i--) {
            maxRight[i] = Math.max(height[i + 1], maxRight[i + 1]);
        }

        for (int i = 1; i < height.length; i++) {
            int min = Math.min(maxLeft[i], maxRight[i]);
            if (height[i] < min) {
                res += (min - height[i]);
            }
        }
        
        return res;
    }*/

}
