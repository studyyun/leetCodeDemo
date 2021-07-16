package SwordFinger.ThirtySix;

/**
 * 应用模块名称
 *
 * @author zhousy
 * @date 2021-07-16  8:22
 */
public class Node {

    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
    
}
