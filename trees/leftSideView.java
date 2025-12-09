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
public class leftSideView{
	public static List<Integer> leftView(TreeNode root){
		List<Integer> res = new ArrayList<>();
		if(root == null) return res;

		Queue <TreeNode> q = new LinkedList<>();
		q.offer(root);

		while(!q.isEmpty()){
			int level = q.size();
			for(int i = 0; i < level; i++){
				TreeNode curr = q.poll();
				if(i == 0) res.add(curr.val);

				if(curr.left != null) q.offer(curr.left);
				if(curr.right != null) q.offer(curr.right);
			}
		}
		return res;
	}
	public static void main(String args[]){
		TreeNode root = new TreeNode(1); 
		root.left = new TreeNode(2);
		root.right = new TreeNode(3); 

		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		root.left.left.left = new TreeNode(6); 

		System.out.println(leftView(root)); // 1, 2, 4, 6 should be displayed
	}
}
