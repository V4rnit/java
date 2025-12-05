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
public class isBinarySearchTree {

    public static boolean wrapper(TreeNode root){
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static boolean isBST(TreeNode root, long left, long right){
        if(root == null){
            return true;
        }
        if(root.val <= left || root.val >= right){
            return false;
        }
        return isBST(root.left, left, root.val) && isBST(root.right, root.val, right);
    }

    public static void BFS(TreeNode node){
        if(node == null){
            return;
        }
        Queue <TreeNode> q = new LinkedList<>();

        q.add(node);

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
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(20);
        root.right = new TreeNode(70);
        
        System.out.println(wrapper(root));

        System.out.println("The level order traversal for the given Binary Tree is: ");
        BFS(root);
    }
}
