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
public class isBlancedBinaryTree {
    public static boolean isBalanced(TreeNode root){
        return (checkHeight(root) == -1) ? false : true;
    }
    public static int checkHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = checkHeight(root.left);
        if(lh == -1){
            return -1;
        }
        int rh = checkHeight(root.right);
        if(rh == -1){
            return -1;
        }
        if(Math.abs(lh - rh) > 1){
            return - 1;
        }
        return 1 + Math.max(lh, rh);
    }
    public static void main(String args[]){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);

        System.out.println(isBalanced(root));
    }
}
