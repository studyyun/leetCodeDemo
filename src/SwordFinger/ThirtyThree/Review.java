package SwordFinger.ThirtyThree;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2022-08-31  9:08
 */
public class Review {

    public boolean verifyPostorder(int[] postorder) {
        if (postorder.length == 0) {
            return true;
        }
        return dfs(postorder, 0, postorder.length - 1);
    }

    private boolean dfs(int[] postorder, int i, int j) {
        if (i >= j) {
            return true;
        }
        int p = i;
        while (postorder[p] < postorder[j]) {
            p++;
        }
        int m = p;
        while (postorder[p] > postorder[j]) {
            p++;
        }
        return p == j && dfs(postorder, i, m - 1) && dfs(postorder, m, j - 1);
    }

    public static void main(String[] args) {
        int[] postorder = new int[]{4, 8, 6, 12, 16, 14, 10};
        new Review().verifyPostorder(postorder);
    }

}
