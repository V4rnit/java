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
public class subTreeOfAnotherTree {
    public static boolean sameTree(TreeNode r1, TreeNode r2){
        if(r1 == null && r2 == null){
            return true;
        }
        if(r1 == null || r2 == null){
            return false;
        }
        if(r1.val != r2.val){
            return false;
        }
        return sameTree(r1.left, r2.left) && sameTree(r1.right, r2.right);
    }
    public static boolean sameSubTree(TreeNode mainRoot, TreeNode subRoot){
        if(subRoot == null && mainRoot != null){
            return true;
        }
        if(mainRoot == null && subRoot != null){
            return false;
        }
        if(sameTree(mainRoot, subRoot)){
            return true;
        }
        return sameSubTree(mainRoot.left, subRoot) || sameSubTree(mainRoot.right, subRoot);
    }
    public static void main(String args[]) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left= new TreeNode(4);
        root1.left.right = new TreeNode(5);
        root1.left.left.left = new TreeNode(6);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(5);

        System.out.println(sameSubTree(root1, root2));
    }
}
