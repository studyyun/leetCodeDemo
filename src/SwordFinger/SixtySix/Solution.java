package SwordFinger.SixtySix;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-11-22  9:01
 */
public class Solution {

    public int[] constructArr(int[] a) {
        if(a.length == 0){
            return a;
        }
        int[] resultArr = new int[a.length];
        resultArr[0] = 1;
        int b = 1;
        for (int i = 1; i < a.length; i++) {
            resultArr[i] = resultArr[i - 1] * a[i - 1];
        }

        for (int i = a.length - 2; i >= 0; i--) {
            b = b * a[i + 1];
            resultArr[i] = resultArr[i] * b;
        }

        return resultArr;
    }

}
