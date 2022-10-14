package SwordFinger.FortyFive;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-10-11  8:38
 */
public class Review {

    public String minNumber(int[] nums) {
        dfs(nums, 0, nums.length - 1);
        StringBuilder builder = new StringBuilder();
        for (int i : nums) {
            builder.append(i);
        }
        return builder.toString();
    }

    private void dfs(int[] nums, int low, int high) {
        if (low < high) {
            int index = getIndex(nums, low, high);
            dfs(nums, low, index - 1);
            dfs(nums, index + 1, high);
        }
    }

    private int getIndex(int[] nums, int low, int high) {
        int temp = nums[low];
        String tempStr = temp + "";
        while (low < high) {
            while (low < high && (nums[high] + tempStr).compareTo(tempStr + nums[high]) >= 0) {
                high--;
            }
            nums[low] = nums[high];
            while (low < high && (nums[low] + tempStr).compareTo(tempStr + nums[low]) <= 0) {
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = temp;
        return low;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{3,30,34,5,9};
        new Review().minNumber(ints);
    }
}
