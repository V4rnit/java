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
	public List<List<Integer>> levelOrder(TreeNode root){
		List<List<Integer>> res = new ArrayList<>();
		if(root == null){
			return res;
		}
		Queue <TreeNode> q = new LinkedList<>();
		q.offer(root);

		while(!q.isEmpty()){
			int n = q.size();
			List<Integer> oneD  = new ArrayList<>();
			for(int i = 0; i < n; i++){
				TreeNode curr = q.poll();
				oneD.add(curr.val);
				if(curr.left != null){
					q.offer(curr.left);
				}
				if(curr.right != null){
					q.offer(curr.right);
				}
			}
			res.add(oneD);
		}
		return res;
	}
}
public class bfs{
	public static void main(String [] args){

	}
}
