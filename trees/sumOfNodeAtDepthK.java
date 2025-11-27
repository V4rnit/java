import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class sumOfNodeAtDepthK {
    public static int sumAtK(TreeNode root, int k){
        if(root == null){
            return 0;
        }
        if(k == 0){
            return root.val;
        }
        return sumAtK(root.left, k-1) + sumAtK(root.right, k-1);
        
    }
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(20);
        root.right = new TreeNode(40);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(50);

        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(99);

        int sum = sumAtK(root, 2);

        System.out.println(sum);
    }
}
