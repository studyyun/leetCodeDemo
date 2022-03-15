package Review;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-03-14  9:46
 */
public class Solution18 {

    public String reverseLeftWords(String s, int n) {
        StringBuilder strBil = new StringBuilder();
        for(int i = n; i < n +s.length(); i++){
            strBil.append(s.charAt(i % s.length()));
        }
        return strBil.toString();
    }
    
    
}
