import java.util.*;

/*
    TreeNode class
    Used in almost all Binary Tree / BST problems on LeetCode
*/
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    // Constructor
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

/*
    Solution class solving MULTIPLE Binary Tree / BST problems:

    1. Invert Binary Tree
    2. Maximum Depth of Binary Tree
    3. Same Tree
    4. Subtree of Another Tree
    5. Balanced Binary Tree
    6. Diameter of Binary Tree
    7. Path Sum
    8. Lowest Common Ancestor in BST
    9. Level Order Traversal
    10. Right Side View
    11. Left Side View
*/
class Solution{

    // Problem: Invert Binary Tree
    // Swap left and right children recursively
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

    // Problem: Maximum Depth of Binary Tree
    // Height = 1 + max(left height, right height)
    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1 + Math.max(lh, rh);
    }

    // Problem: Same Tree
    // Check if two trees are structurally identical with same values
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

    // Problem: Subtree of Another Tree
    // Check if subRoot exists somewhere inside root
    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        if(subRoot == null && root != null){
            return true;
        }
        if(root == null && subRoot != null){
            return false;
        }
        if(isSameTree(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // Problem: Balanced Binary Tree
    // A tree is balanced if height difference <= 1 for all nodes
    public boolean isBalanced(TreeNode root){
        return getHeight(root) != -1;
    }

    // Helper for isBalanced
    // Returns -1 if unbalanced
    public int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }

        int lh = getHeight(root.left);
        if(lh == -1) return -1;

        int rh = getHeight(root.right);
        if(rh == -1) return -1;

        if(Math.abs(lh - rh) > 1){
            return -1;
        }

        return 1 + Math.max(lh, rh);
    }

    // Problem: Diameter of Binary Tree
    // Longest path between any two nodes
    public int diameterOfBinaryTree(TreeNode root){
        int[] diameter = new int[1];
        calculateDiameter(root, diameter);
        return diameter[0];
    }

    // Helper for diameter calculation
    public int calculateDiameter(TreeNode root, int[] diameter){
        if(root == null){
            return 0;
        }

        int lh = calculateDiameter(root.left, diameter);
        int rh = calculateDiameter(root.right, diameter);

        diameter[0] = Math.max(diameter[0], lh + rh);

        return 1 + Math.max(lh, rh);
    }

    // Problem: Path Sum
    // Check if root-to-leaf path equals targetSum
    public boolean hasPathSum(TreeNode root, int targetSum){
        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null){
            return targetSum - root.val == 0;
        }

        return hasPathSum(root.left, targetSum - root.val)
            || hasPathSum(root.right, targetSum - root.val);
    }

    // Problem: Lowest Common Ancestor in BST
    // Uses BST property
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return null;
        }

        if(Math.max(p.val, q.val) < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        else if(Math.min(p.val, q.val) > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        else{
            return root;
        }
    }

    // Problem: Binary Tree Level Order Traversal
    // BFS using Queue
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int lvl = q.size();
            List<Integer> curr = new ArrayList<>();

            for(int i = 0; i < lvl; i++){
                TreeNode node = q.poll();
                curr.add(node.val);

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            res.add(curr);
        }
        return res;
    }

    // Problem: Binary Tree Right Side View
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int lvl = q.size();
            for(int i = 0; i < lvl; i++){
                TreeNode node = q.poll();

                if(i == lvl - 1){
                    res.add(node.val);
                }

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
        }
        return res;
    }

    // Problem: Binary Tree Left Side View
    public List<Integer> leftSideView(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int lvl = q.size();
            for(int i = 0; i < lvl; i++){
                TreeNode node = q.poll();

                if(i == 0){
                    res.add(node.val);
                }

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
        }
        return res;
    }
}

public class TreeClass {
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

        // Max Depth
        System.out.println("Max Depth: " + sol.maxDepth(root));

        // Balanced Tree
        System.out.println("Is Balanced: " + sol.isBalanced(root));

        // Diameter
        System.out.println("Diameter: " + sol.diameterOfBinaryTree(root));

        // Level Order
        System.out.println("Level Order: " + sol.levelOrder(root));

        // Right Side View
        System.out.println("Right Side View: " + sol.rightSideView(root));

        // Left Side View
        System.out.println("Left Side View: " + sol.leftSideView(root));

        // Path Sum
        System.out.println("Has Path Sum 7: " + sol.hasPathSum(root, 7));

        // Invert Tree
        TreeNode inverted = sol.invertTree(root);
        System.out.println("Level Order After Inversion: " + sol.levelOrder(inverted));

        // Same Tree
        TreeNode sameTree = new TreeNode(1);
        sameTree.left = new TreeNode(3);
        sameTree.right = new TreeNode(2);
        sameTree.right.left = new TreeNode(5);
        sameTree.right.right = new TreeNode(4);

        System.out.println("Is Same Tree: " + sol.isSameTree(inverted, sameTree));

        // Subtree
        TreeNode subRoot = new TreeNode(2);
        subRoot.left = new TreeNode(5);
        subRoot.right = new TreeNode(4);

        System.out.println("Is Subtree: " + sol.isSubtree(inverted, subRoot));

        // LCA (BST example)
        TreeNode p = inverted.left;   // node with value 3
        TreeNode q = inverted.right;  // node with value 2
        TreeNode lca = sol.lowestCommonAncestor(inverted, p, q);
        System.out.println("LCA: " + (lca != null ? lca.val : "null"));
    }
}
