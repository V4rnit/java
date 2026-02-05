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
	public int maxDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);

		return 1 + Math.max(left, right);
	}
	public List<List<Integer>> levelOrder(TreeNode root){
		List<List<Integer>> res = new ArrayList<>();
		if(root == null){
			return res;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);

		while(!q.isEmpty()){
			int lvl = q.size();
			List<Integer> currLvl = new ArrayList<>();

			for(int i = 0; i < lvl; i++){
				TreeNode currNode = q.poll();
				currLvl.add(currNode.val);
				
				if(currNode.left != null){
					q.offer(currNode.left);
				}
				if(currNode.right != null){
					q.offer(currNode.right);
				}
			}
			res.add(currLvl);
		}
		return res;
	}
}
public class maxDepth{
	public static void main(String [] args){
		Solution sol = new Solution();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(4);

		System.out.println(sol.maxDepth(root));

		System.out.println("The level order traversal is:");
		System.out.println(sol.levelOrder(root));
	}
}
