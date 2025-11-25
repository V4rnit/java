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
public class sameTree {
    public static boolean SameTree(TreeNode r1, TreeNode r2) {
        if(r1 == null && r2 == null){
            return true;
        }
        if(r1 == null || r2 == null){
            return false;
        }
        if(r1.val != r2.val){
            return false;
        }
        return SameTree(r1.left, r2.left) && SameTree(r1.right, r2.right);
    }
    public static void bfs(TreeNode root){
        if(root == null){
            return;
        }
        Queue <TreeNode> q = new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            System.out.println(curr.val);
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }
    public static void main(String args[]){
        //Tree one 
        TreeNode r1 = new TreeNode(1);;
        r1.left = new TreeNode(2);
        r1.right = new TreeNode(3);

        //Tree Two
        TreeNode r2 = new TreeNode(1);
        r2.left = new TreeNode(2);
        r2.right = new TreeNode(3);

        System.out.println("The level order traversal for Tree 1 is: ");
        bfs(r1);

        System.out.println("The level order traversal for Tree 2 is: ");
        bfs(r2);
        
        System.out.println(SameTree(r1, r2)); 
    }
}
