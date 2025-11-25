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
public class diameter {
    public static int wrapper(TreeNode root){
        int [] res = new int [1];
        getHeight(root, res);
        return res[0];
    }
    public static int getHeight(TreeNode root, int [] res){
        if(root == null){
            return 0;
        }
        int lh = getHeight(root.left, res);
        int rh = getHeight(root.right, res);

        res[0] = Math.max(res[0], lh + rh);
        return 1 + Math.max(lh, rh);
    }

    public static void bfs(TreeNode root){
        if(root == null){
            return;
        }
        Queue <TreeNode> q = new LinkedList <>();

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

    // Call BFS
        bfs(root);

    // Call Diameter
        int d = wrapper(root);
        System.out.println("Diameter: " + d);
}

}