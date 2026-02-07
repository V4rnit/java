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
	public int maxDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		int lh = maxDepth(root.left);
		int rh = maxDepth(root.right);

		return 1 + Math.max(lh, rh);
	}
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
	public boolean isSubtree(TreeNode root, TreeNode subRoot){
		if(subRoot == null && root != null){
			return true;
		}
		if(root == null && subRoot != null){
			return false;
		}
		if(isSameTree(root, subRoot) == true){
			return true;
		}
		return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
	}
	public boolean isBalanced(TreeNode root){
		int check =  getHeight(root);
		return (check == -1) ? false : true;
	}
	public int getHeight(TreeNode root){
		if(root == null){
			return 0;
		}
		int lh = getHeight(root.left);
		if(lh == -1){
			return -1;
		}
		int rh = getHeight(root.right);
		if(rh == -1){
			return -1;
		}
		if(Math.abs(lh - rh) > 1){
			return -1;
		}
		return 1 + Math.max(lh, rh);
	}
	public int diameterOfBinaryTree(TreeNode root){
		int [] diameter = new int [1];
		calculateDiameter(root, diameter);
		return diameter[0];
	}
	public int calculateDiameter(TreeNode root, int [] diameter){
		if(root == null){
			return 0;
		}
		int lh = calculateDiameter(root.left, diameter);
		int rh = calculateDiameter(root.right, diameter);

		diameter[0] = Math.max(lh + rh, diameter[0]);
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
			List<Integer> currVals = new ArrayList<>();
			for(int i = 0; i < lvl; i++){
				TreeNode curr = q.poll();
				currVals.add(curr.val);

				if(curr.left != null){
					q.offer(curr.left);
				}
				if(curr.right != null){
					q.offer(curr.right);
				}
				
			}
			res.add(currVals);
		}
		return res;
	}
}

public class TreeEasyClass {
    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \
            4   5
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution sol = new Solution();

        // maxDepth
        System.out.println("Max Depth: " + sol.maxDepth(root));

        // isBalanced
        System.out.println("Is Balanced: " + sol.isBalanced(root));

        // diameterOfBinaryTree
        System.out.println("Diameter: " + sol.diameterOfBinaryTree(root));

        // levelOrder
        System.out.println("Level Order Traversal:");
        System.out.println(sol.levelOrder(root));

        // invertTree
        TreeNode inverted = sol.invertTree(root);
        System.out.println("Level Order After Inversion:");
        System.out.println(sol.levelOrder(inverted));

        // isSameTree
        TreeNode sameTree = new TreeNode(1);
        sameTree.left = new TreeNode(3);
        sameTree.right = new TreeNode(2);
        sameTree.right.left = new TreeNode(5);
        sameTree.right.right = new TreeNode(4);

        System.out.println("Is Same Tree: " + sol.isSameTree(inverted, sameTree));

        // isSubtree
        TreeNode subRoot = new TreeNode(2);
        subRoot.left = new TreeNode(5);
        subRoot.right = new TreeNode(4);

        System.out.println("Is Subtree: " + sol.isSubtree(inverted, subRoot));
    }
}
