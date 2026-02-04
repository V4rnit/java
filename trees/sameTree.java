import java.util.*;
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;

	//Constructor
	TreeNode(int val){
		this.val = val;
		this.left = null;
		this.right = null;
	}
}
class Solution{
	public boolean isSameTree(TreeNode p, TreeNode q){
		if(p == null && q == null){
			return true;
		}
		if(p == null || q == null){
			return false;
		}
		if(p.val != q.val){
			return false;
		}
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		
	}
}
public class sameTree{
	public static void main(String [] args){
		//Tested on Leetcode
	}
}
