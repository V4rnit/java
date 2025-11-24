package trees;
import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode (int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class height {
    public static int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);

        return 1 + Math.max(lh, rh);
    }
    public static void main(String args[]){  
        TreeNode root = new TreeNode (1);
        root.left = new TreeNode(2);

        int h = getHeight(root);

        System.out.println(h);
    }
}
