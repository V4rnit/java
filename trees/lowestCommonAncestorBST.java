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
public class lowestCommonAncestorBST{
	public static TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q){
		TreeNode curr = root;
		while(curr != null){
			if(p.val < curr.val && q.val < curr.val){
				curr = curr.left;
			}
			else if(p.val > curr.val && q.val > curr.val){
				curr = curr.right;
			}
			else{
				return curr;
			}
		}
		return null;
	
	}

	public static void main(String args[]){

		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(8);

		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(4);

		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(9);

		root.left.left.right= new TreeNode(2);
	
		TreeNode found = findLCA(root, root.left, root.left.right);

		System.out.println(found.val);

	}
}
