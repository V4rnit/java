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
	public boolean isValidBST(TreeNode root){
		boolean check = isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
		return check;
	}
	public boolean isBST(TreeNode root, long min, long max){
		if(root == null){
			return true;
		}
		if(root.val <= min || root.val >= max){
			return false;
		}
		return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
	}
}
public class isBinarySearchTree{
	public static void main (String [] args){
		//Tested on Leetcode 
	}
}
