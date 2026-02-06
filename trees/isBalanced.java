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
	public boolean isBalanced(TreeNode root){
		int check = calculateHeightDifference(root);
		
		return (check == -1) ? false : true;
	}
	public int calculateHeightDifference(TreeNode root){
		//Calculating regular height
		//At any point the abs(lh - rh) is greater than 1 the tree is not balanced
		if(root == null){
			return 0;
		}

		//Left height caller
		int lh = calculateHeightDifference(root.left);
		if(lh == -1){
			return -1;
		}

		//right height caller
		int rh = calculateHeightDifference(root.right);
		if(rh == -1){
			return -1;
		}

		if(Math.abs(lh - rh) > 1){
			return -1;
		}
		return 1 + Math.max(lh, rh);
	}
	public List<List<Integer>> levelOrder(TreeNode root){
		List<List<Integer>> res = new ArrayList<>();

		if(root == null){
			return res;
		}
		Queue <TreeNode> q = new LinkedList<>();
		q.offer(root);

		while(!q.isEmpty()){
			int lvl = q.size();
			List<Integer> currVal = new ArrayList<>();

			for(int i = 0; i < lvl; i++){
				TreeNode curr = q.poll();
				currVal.add(curr.val);
				if(curr.left != null){
					q.offer(curr.left);
				}
				if(curr.right != null){
					q.offer(curr.right);
				}
			}
			res.add(currVal);
		}
		return res;
	}
}

public class isBalanced{
	public static void main(String [] args){
		Solution sol = new Solution();

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		System.out.println("The level order traversal for this tree is: " +  sol.levelOrder(root));
	
		System.out.println("Is this this balanced : " + sol.isBalanced(root));
	}
}
