
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class levelOrderTraversal{

    public static List<List<Integer>> levelOrder(TreeNode root) {
	    List<List<Integer>> res = new ArrayList<>();

	    if(root == null) return res;

	    Queue<TreeNode> q = new LinkedList<>();

	    q.offer(root);

	    while(!q.isEmpty()){
		    int level = q.size();
		    List<Integer> currList = new ArrayList<>();

		    for(int i = 0; i < level; i++){
			    TreeNode curr = q.poll();
			    currList.add(curr.val);

			    if(curr.left != null) q.offer(curr.left);
			    if(curr.right != null) q.offer(curr.right);
		    }
		    res.add(currList);
	    }
	    return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = levelOrder(root);

        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}
