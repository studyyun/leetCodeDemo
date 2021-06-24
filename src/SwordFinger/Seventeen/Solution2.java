package SwordFinger.Seventeen;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-24  9:16
 */
public class Solution2 {

    private char[] chars;
    private StringBuilder strBuilder;
    private int index = 0;
    //当前数字中9的个数
    private int nine = 0;

    //考虑大数
    public String printNumbers(int n) {
        strBuilder = new StringBuilder((int) Math.pow(10, n) * (n + 1));
        chars = new char[n];
        index = n - 1;
        recursion(0, n);
        return strBuilder.toString().substring(2, strBuilder.length() - 1);
    }


    private void recursion(int x, int n) {

        if (x == n) {
            String s = String.valueOf(chars).substring(index);
            strBuilder.append(s).append(",");
            if (n - index == nine) {
                index--;
            }
            return;
        }

        for (char c = '0'; c <= '9'; c++) {
            if (c == '9') {
                nine++;
            }
            chars[x] = c;
            recursion(x + 1, n);
        }
        nine--;
    }

    public static void main(String[] args) {
        int count = 1;
        String s = new Solution2().printNumbers(6);
        String[] split = s.split(",");
        for (String s1 : split) {
            if (count % 20 == 0){
                System.out.println();
            }
            System.out.print(s1 + "  ");
            count++;
        }
//        System.out.println(new Solution2().printNumbers(7));
        
        /*int i = 1;
        String s = "" + i;
        char[] a = new char[3];
        a[0] = s.charAt(0);
        System.out.println(a[0]);*/
        
        /*char[] a = {'a','b','c'};
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(a);
        System.out.println(strBuilder.toString());*/

    }
}
