package SwordFinger.Seventeen;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-24  9:16
 */
public class Solution {

    private char[] chars;
    private char[] loopChar = {'0','1','2','3','4','5','6','7','8','9'};
    private int[] resultArr;
    private int count = 0;
    
    //不考虑大数
    public int[] printNumbers(int n) {

        chars = new char[n];
        resultArr = new int[(int) (Math.pow(10, n) - 1)];
        recursion(0, n);
        return resultArr;
    }


    private void recursion(int x, int n) {

        if (x == n) {
            String s = String.valueOf(chars);
            int i = Integer.parseInt(s);
            if (i == 0){
                return;
            }
            resultArr[count++] = i;
            return;
        }

        for (char c : loopChar) {
            chars[x] = c;
            recursion(x + 1, n);
        }
    }

    public static void main(String[] args) {
        new Solution().printNumbers(2);
        /*int i = 1;
        String s = "" + i;
        char[] a = new char[3];
        a[0] = s.charAt(0);
        System.out.println(a[0]);*/
    }
}
