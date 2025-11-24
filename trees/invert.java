package trees;
import java.nio.channels.Pipe.SourceChannel;
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
public class invert {
    public static TreeNode invertBinaryTree(TreeNode head){
        if(head == null){
            return null;
        }
        TreeNode temp = head.left;
        head.left = head.right;
        head.right = temp;

        invertBinaryTree(head.left);
        invertBinaryTree(head.right);
        return head;
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
    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left = new TreeNode(12);

        System.out.println("Before inverting the tree");
        bfs(root);

        System.out.println("After inverting the tree");
        invertBinaryTree(root);
        bfs(root);
    }
}
