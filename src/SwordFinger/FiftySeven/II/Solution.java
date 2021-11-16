package SwordFinger.FiftySeven.II;

import java.util.ArrayList;
import java.util.List;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-11-16  9:16
 */
public class Solution {
    
    //滑动窗口
    public int[][] findContinuousSequence(int target) {
        List<int[]> listss = new ArrayList<>();
        int i = 1, j = 2, sum;
        int mid = (target >> 1) + 1;
        sum = i+j;
        while (i < j && j < mid) {
            if (sum > target) {
                sum -= i;
                i++;
            } else if (sum < target) {
                j++;
                sum += j;
            } else {
                int[] ints = new int[j-i+1];
                for (int k = i; k <= j; k++) {
                    ints[k-i] = k;
                }
                listss.add(ints);
                j++;
                sum += j;
            }
        }
        return listss.toArray(new int[0][0]);
    }

    public static void main(String[] args) {
        int[][] ints = new Solution().findContinuousSequence(9);
        int i = 0;
        
    }
    
}
