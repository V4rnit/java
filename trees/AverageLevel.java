import java.util.*;
class TreeNode{
	public int val;
	public TreeNode left;
	public TreeNode right;

	//Constructor
	TreeNode(int val){
		this.val = val;
	}
}
class Solution{
	public List<Double> averageOfLevels(TreeNode root){
		List <Double> res = new ArrayList<>();

		if(root == null){
			return res;
		}
		Queue <TreeNode> q = new LinkedList<>();
		q.offer(root);

		while(!q.isEmpty()){
			int level = q.size();
			long  sum = 0;
			for(int i = 0; i < level; i++){
				TreeNode curr = q.poll();
				sum += curr.val;
				if(curr.left != null){
					q.offer(curr.left);
				}
				if(curr.right != null){
					q.offer(curr.right);
				}
			}
			double averageLevel = (double)sum/level;
			res.add(averageLevel);
		}
		return res;
	}
}
public class AverageLevel{
	public static void main (String [] args){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		Solution sol = new Solution();
		List<Double> ans = sol.averageOfLevels(root);

		for(double d : ans){
			System.out.println(d);
		}
	}
}
