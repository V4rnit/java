import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    //constructor
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class sumGreaterThanK {
    public static int sumNodes(TreeNode root, int k){
        if(root == null){
            return 0;
        }
        if(root.val > k){
            return root.val + sumNodes(root.left, k) + sumNodes(root.right, k);
        }
        return sumNodes(root.left, k) + sumNodes(root.right, k);
    }
    public static void main(String args[]) {
        
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(90);

        root.left.left = new TreeNode(12);
        root.left.right = new TreeNode(34);

        root.right.left = new TreeNode(45);
        root.right.right = new TreeNode(70);

        System.out.println(sumNodes(root, 30));
    }
}
