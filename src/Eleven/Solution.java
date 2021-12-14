package Eleven;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-12-14  9:09
 */
public class Solution {

    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, res = 0;
        while (left < right) {
            res = Math.max(res, Math.min(height[left], height[right]) * (right - left));
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            } 
        }
        return res;
    }

}
