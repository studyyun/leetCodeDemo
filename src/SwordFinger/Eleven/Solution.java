package SwordFinger.Eleven;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-21  9:00
 */
public class Solution {

    public int minArray(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[i - 1]){
                return numbers[i];
            }
        }
        return numbers[0];
    }
    
}
