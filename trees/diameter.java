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
public class diameter {
    public static int wrapper(TreeNode root){
        int [] res = new int[1];
        height(root, res);
        return res[0];
    }
    public static int height(TreeNode root, int [] res){
        if(root == null){
            return 0;
        }
        int lh = height(root.left, res);
        int rh = height(root.right, res);
        
        res[0] = Math.max(res[0], lh + rh); 
        return 1 + Math.max(lh, rh);
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
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int d = wrapper(root);
        System.out.println(d);

        System.out.println("The level order traversal for this tree is: ");
        bfs(root);
    }
}
