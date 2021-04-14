package SeventyEight;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    //回溯法
    List<List<Integer>> resultList = new ArrayList<List<Integer>>();

    public List<List<Integer>> subsets(int[] nums) {

        List<Integer> curr = new ArrayList<Integer>();
        resultList.add(curr);
        for(int i = 0;i<nums.length;i++){
            getSubSets(0,i+1,curr,nums);
        }
        return resultList;

    }

    /**
     *
     * @param start 当前所需要构造子集中，第一个数所对应在nums[]数组中最早出现的位置
     * @param size  当前需要构造子集的长度
     * @param curr  当前正在构造的子集
     * @param nums  数组
     */
    public void getSubSets(int start,int size,List<Integer> curr,int[] nums){
        if(size == 0){
            resultList.add(new ArrayList<>(curr));
            return;
        }

        for(int i = start;i<nums.length;i++){
            // 往构造的子集中添加数据
            curr.add(nums[i]);
            // 因为添加了数据，那么i(当前数组中的位置)就要往后移一位，同时，所需要构造子集的长度就少了一位
            getSubSets(i+1,size-1,curr,nums);
            // 关键的一步，这里进行回溯
            curr.remove(curr.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,2,9};
        List<List<Integer>> subsets = new Solution().subsets(nums);
        System.out.println(subsets);

        System.out.println(1 << 3);


    }

}
