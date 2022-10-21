package SwordFinger.FiftyThree.I;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-10-20  8:27
 */
public class Review {

    public int search(int[] nums, int target) {
        //控制target，找两个右边界即可
        int i = findRightBorder(nums, target, 0, nums.length - 1);
        //如果第一次没有找到，直接返回，不需要进行第二次二分查找
        if (i < 1 || nums[i - 1] != target) {
            return 0;
        }
        //第二次二分查找的右边界可以用第一次的右边界，减小二分查找的范围
        return i - findRightBorder(nums, target - 1, 0, i);
    }
    
    private int dfs(int[] nums, int target, int i, int j) {
        int right = findRightBorder(nums, target, i, j);
        int left = findLeftBorder(nums, target, i, j);
        return right - left - 1;
    }

    private int findRightBorder(int[] nums, int target, int i, int j) {
        while (i <= j) {
            int mid = i + ((j - i) >> 1);
            if (nums[mid] <= target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    private int findLeftBorder(int[] nums, int target, int i, int j) {
        while (i <= j) {
            int mid = i + ((j - i) >> 1);
            if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(new Review().search(nums, 6));
    }

}
