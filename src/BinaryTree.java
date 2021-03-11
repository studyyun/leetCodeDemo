import java.util.ArrayList;

public class BinaryTree {

    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> resultList = new ArrayList<>();
        ArrayList<TreeNode> queueList = new ArrayList<>();

        queueList.add(root);
        while (queueList.size()!=0){
            TreeNode tmp = queueList.remove(0);
            resultList.add(tmp.val);
            if (tmp.left!=null){
                queueList.add(tmp.left);
            }
            if (tmp.right!=null){
                queueList.add(tmp.right);
            }
        }

        return resultList;
    }

    public static void main(String[] args) {



    }

}
