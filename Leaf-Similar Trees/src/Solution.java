import java.util.ArrayList;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {

		ArrayList<Integer> leaf1 = new ArrayList<>();
		getleaf(root1, leaf1);
		ArrayList<Integer> leaf2 = new ArrayList<>();
		getleaf(root2, leaf2);

		return leaf1.equals(leaf2);
	}

	private void getleaf(TreeNode root, ArrayList<Integer> leaf) {
		if (root != null) {
			if(root.left == null && root.right == null) {
				leaf.add(root.val);
			}
			getleaf(root.left, leaf);
			getleaf(root.right, leaf);
		}
	}
}
