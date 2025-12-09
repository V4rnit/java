import java.util.*;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode (int val){
		this.val = val;
		this.left = null;
		this.right = null;
	}
}
public class rightSideView{
	public static List<Integer> view(TreeNode root){
		List<Integer> res = new ArrayList<>();
		if(root == null) return res;

		Queue <TreeNode> q = new LinkedList<>();
		q.offer(root);

		while(!q.isEmpty()){
			int level = q.size();
			for(int i = 0; i < level; i++){
				TreeNode curr = q.poll();
				if(i == level - 1) res.add(curr.val);
				if(curr.left != null) q.offer(curr.left);
				if(curr.right != null) q.offer(curr.right);
			}
		}
		return res;
	}
	public static void main(String args[]){
		TreeNode root = new TreeNode(1); //This should be displayed
		root.left = new TreeNode(2);
		root.right = new TreeNode(3); //This should be displayed 
	
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(5); //This should be displayed
		
		System.out.println(view(root));
	}
}
