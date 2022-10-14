package SwordFinger.Seventeen;

import java.util.Arrays;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-19  8:06
 */
public class Review {

    private String[] res;
    private StringBuilder builder = new StringBuilder();
    private int index = 0;
    private char[] chars = {'0','1','2','3','4','5','6','7','8','9'};

    //考虑大数
    public String[] printNumbers(int n) {
        res = new String[(int) Math.pow(10, n) - 1];
        //处理每一位，0表示最左边第一位
        for (int i = 1; i <= n; i++) {
            dfs(0, i);
        }
        return res;
    }

    private void dfs(int start, int length) {

        if (builder.length() == length) {
            res[index++] = builder.toString();
            return;
        }
        //只有最左边第一位不能为0，需要从1开始，其他位都可以从0开始
        start = start == 0 ? 1 : 0;

        for (int i = start; i < 10; i++) {
            builder.append(chars[i]);
            dfs(start + 1, length);
            //回溯法
            builder.deleteCharAt(builder.length() - 1);
        }

    }

    public static void main(String[] args) {
        String[] strings = new Review().printNumbers(3);
        System.out.println(strings.length);
        Arrays.stream(strings).forEach(System.out::println);
    }

}
