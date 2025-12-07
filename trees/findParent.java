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

public class findParent{
	public static TreeNode findParentBST(TreeNode root, int id){
		if(root == null || (root.left == null && root.right == null))	{
			return null;
		}
		if(root.val > id){
			if(root.left != null && root.left.val == id){
				return root;
			}
			return findParentBST(root.left, id);
		}
		if(root.val < id){
			if(root.right != null && root.right.val == id){
				return root;
			}
			return findParentBST(root.right, id);
		}
		return null;
	}
	public static void main(String args[])	{
		TreeNode root = new TreeNode(50);
		root.left = new TreeNode(40);
		root.right = new TreeNode(60);

		root.left.left = new TreeNode(20);
		root.left.right = new TreeNode(30);

		root.right.left = new TreeNode(55);
		root.right.right = new TreeNode(70);

		TreeNode parent = findParentBST(root, 70);

		System.out.println(parent.val);
	}
}
