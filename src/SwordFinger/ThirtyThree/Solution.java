package SwordFinger.ThirtyThree;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-07-05  8:58
 */
public class Solution {

    //二叉搜索树的特性很关键，左子树 < 根 < 右子树
    public boolean verifyPostorder(int[] postorder) {

        if (postorder.length == 0) {
            return true;
        }

        return dfs(0, postorder.length - 2, postorder, postorder.length - 1);

    }

    private boolean dfs(int n, int m, int[] postorder, int i) {

        if (m < 0 || n >= postorder.length || n > m) {
            return true;
        }
        int p = n;
        int q = m;
        while (n < postorder.length && postorder[n] < postorder[i]) {
            n++;
        }

        while (m >= 0 && postorder[m] > postorder[i]) {
            m--;
        }

        return n > m && dfs(p, m - 1, postorder, m) && dfs(n, q - 1, postorder, q);

    }

    public static void main(String[] args) {
        new Solution().verifyPostorder(new int[]{1,3,2,6,5});
    }

}
