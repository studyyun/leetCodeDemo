package SeventyFive;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-01-18  9:48
 */
public class Solution2 {
    
    //刷漆
    public void sortColors(int[] nums) {
        int index0 = 0, index1 = 0;
        // 0 2 1 2    0 2 1 2 0 1   0 1 1 0
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            //利用刷漆的思想，先全部刷成2
            nums[i] = 2;
            //然后把小于2的情况全部刷成1，覆盖部分2
            if (num < 2) {
                nums[index1++] = 1;
            }
            //然后把0的情况全部刷成0，覆盖1的部分
            if (num < 1) {
                nums[index0++] = 0;
            }
        }
        
    }
    
}
