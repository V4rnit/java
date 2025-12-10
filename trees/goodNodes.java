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
public class goodNodes{
	public static int countGoodNodes(TreeNode root){
		return (dfs(root, root.val));
	}
	public static int dfs(TreeNode root, int maxSeen){
		if(root == null){
			return 0;
		}
		int newMax = Math.max(maxSeen, root.val);

		return(root.val >= maxSeen ? 1 : 0) + dfs(root.left, newMax)
						+ dfs(root.right, newMax);
	}

	public static void main(String args[]){
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(1);

		root.left.left = new TreeNode(3);
		root.right.left = new TreeNode(1);
		root.right.right = new TreeNode(5);

		System.out.println("The number of good nodes in this given Binary tree are: ");
		System.out.println(countGoodNodes(root));
	}
}
