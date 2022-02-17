package Review;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-02-17  10:49
 */
public class Solution8 {

    public int strStr(String haystack, String needle) {
        if ("".equals(needle)) {
            return 0;
        }
        int length1 = haystack.length();
        int length2 = needle.length();
        if (length1 < length2) {
            return -1;
        }
        int p1 = 0, p2 = 0, i = 0;
        while (i <= (length1 - length2)) {
            p1 = i;
            while (haystack.charAt(p1) == needle.charAt(p2)) {
                p1++;
                p2++;
                if (p2 == length2) {
                    return i;
                }
                if (p1 == length1) {
                    break;
                }

            }
            p2 = 0;
            i++;
        }
        return -1;
    }
}
