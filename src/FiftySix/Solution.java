package FiftySix;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-01-14  9:20
 */
public class Solution {

    public int[][] merge(int[][] intervals) {
        //先以数组的第一个元素排序
        Arrays.sort(intervals, Comparator.comparingInt(v -> v[0]));
        //初始化会有值0
        int[][] res = new int[intervals.length][2];
        //res数组的索引
        int index = -1;
        for (int[] interval : intervals) {
            //如果结果数组里面没有数据或者没有交界的范围，直接插入数据
            if (index == -1 || res[index][1] < interval[0]) {
                res[++index] = interval;
            } else {
                //右边界
                res[index][1] = Math.max(interval[1], res[index][1]);
            }
        }
        //截取数组长度
        return Arrays.copyOf(res, index + 1);
    }
    
}
