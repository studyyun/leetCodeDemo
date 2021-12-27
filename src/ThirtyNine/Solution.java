package ThirtyNine;

import java.util.ArrayList;
import java.util.List;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-12-27  9:14
 */
public class Solution {

    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        backtracking(candidates, target, 0, new ArrayList<>());
        return res;
    }
    
    //回溯法
    private void backtracking(int[] candidates, int target, int begin, List<Integer> list) {
        if (target < 0) {
            return;
        }

        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        
        // i = begin很关键，因为此题 2 2 3 和 2 3 2 是属于重复的，所以这里设置i = begin，可以起到去重的作用
        for (int i = begin; i < candidates.length; i++) {
            //如果先不排序，则相当于直接进行递归，可能会有很多重复的计算；
            //但是先排序，排序的复杂度一般都不会低，所以具体如何使用，看具体情况
            list.add(candidates[i]);
            backtracking(candidates, target - candidates[i], i, list);
            list.remove(list.size() - 1);
        }
    }

}
