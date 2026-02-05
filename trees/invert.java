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
	public TreeNode invertTree(TreeNode root){
		if(root == null){
			return null;
		}
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;

		invertTree(root.left);
		invertTree(root.right);
		return root;
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
public class invert{
    public static void main(String args[]) {
	Solution sol = new Solution();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left = new TreeNode(12);
	
 	List<List<Integer>> before = sol.levelOrder(root);
	System.out.println(before);

	TreeNode inverted = sol.invertTree(root);
	List<List<Integer>> after = sol.levelOrder(inverted);
	System.out.println(after);
	
    }
}
