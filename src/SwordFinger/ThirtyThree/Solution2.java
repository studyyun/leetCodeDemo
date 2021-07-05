package SwordFinger.ThirtyThree;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-07-05  8:58
 */
public class Solution2 {
    
    //二叉搜索树的特性很关键，左子树 < 根 < 右子树
    public boolean verifyPostorder(int[] postorder) {

        if (postorder.length == 0) {
            return true;
        }

        return dfs(postorder, 0, postorder.length - 1);
    }

    private boolean dfs(int[] postorder, int m, int n) {
        
        //任意两个数都可以构成二叉搜索树的后序遍历
        if (m >= n-1){
            return true;
        }

        int p = m;
        while (postorder[p] < postorder[n]) {
            p++;
        }
        int j = p;
        while (postorder[p] > postorder[n]) {
            p++;
        }

        return p == n && dfs(postorder, m, j - 1) && dfs(postorder, j, n - 1);
    }

    public static void main(String[] args) {
        new Solution2().verifyPostorder(new int[]{1, 3, 2, 6, 5});
    }

}
