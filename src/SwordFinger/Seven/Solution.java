package SwordFinger.Seven;

import SwordFinger.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-06-18  8:49
 */
public class Solution {

    private int[] preorder;
    private Map<Integer, Integer> map;


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.map = new HashMap<Integer, Integer>((int) (inorder.length / 0.75 + 1));
        for (int i = 0; i < inorder.length; i++) {
            //将中序的值和索引的映射关系存到map中，同时，值不能有重复的存在
            map.put(inorder[i], i);
        }

        return recursion(0, 0, preorder.length - 1);
    }

    /**
     * 分治法，递归
     * 所以这里其实是把前序中的每个节点来构建树，中序主要是用来找寻边界和定位前序中的节点
     * 
     * @param root  前序中的根节点索引
     * @param left  中序中的左边界索引
     * @param right 中序中的右边界索引
     * @return 节点树
     */
    private TreeNode recursion(int root, int left, int right) {
        if (left > right) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[root]);
        //中序，根节点的索引
        int i = map.get(preorder[root]);
        //左子树
        node.left = recursion(root + 1, left, i - 1);
        //右子树
        node.right = recursion((root + 1) + (i - 1 - left + 1), i + 1, right);
        return node;
    }

    public static void main(String[] args) {
        System.out.println(3 / 0.75 + 1);
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        new Solution().buildTree(preorder, inorder);
    }
}
