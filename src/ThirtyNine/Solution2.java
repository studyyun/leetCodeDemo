package ThirtyNine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-12-27  9:29
 */
public class Solution2 {

    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //先排序，回溯的时候可以直接剪枝
        Arrays.sort(candidates);
        backtracking(candidates, target, 0, new ArrayList<>());
        return res;
    }

    //回溯法
    private void backtracking(int[] candidates, int target, int begin, List<Integer> list) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = begin; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }
            list.add(candidates[i]);
            backtracking(candidates, target - candidates[i], i, list);
            list.remove(list.size() - 1);
        }
    }
    
}
