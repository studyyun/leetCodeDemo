package SwordFinger.Eleven;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-11  7:54
 */
public class Review {

    // 找右排序数组的第一位
    public int minArray(int[] numbers) {
        int left = 0, right = numbers.length - 1, mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if (numbers[mid] < numbers[right]) {
                //说明右排序数组的第一位在左半区，有可能mid这个位置就是右排序数组的第一位，所以right = mid - 1就会跳过这个位置
                right = mid;
            } else if (numbers[mid] > numbers[right]) {
                //说明右排序数组的第一位在右半区
                left = mid + 1;
            } else {
                //因为数组允许有重复的数值出现，所以即使丢弃掉一个最小值，剩余的数组里面还会有一个最小值
                right--;
            }
        }
        //不跟左边界left相比的原因是：1 2 3 4 5   和  3 4 5 1 2   这两种情况无法做区分
        return numbers[left];
    }

}
