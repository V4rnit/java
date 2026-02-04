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
class Solution{
	public int diameterOfBinaryTree(TreeNode root){
		int [] diameter = new int[1];
		getDiameter(root, diameter);
		return diameter[0];
	}
	public int getDiameter(TreeNode root, int [] diameter){
		if(root == null){
			return 0;
		}
		int left = getDiameter(root.left, diameter);
		int right = getDiameter(root.right, diameter);

		diameter[0] = Math.max(diameter[0], left + right);
		return 1 + Math.max(left, right);
	}
}
public class Diameter{
	public static void main(String [] args){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		Solution sol = new Solution();
		int res = sol.diameterOfBinaryTree(root);
		System.out.println(res);
	}
}
