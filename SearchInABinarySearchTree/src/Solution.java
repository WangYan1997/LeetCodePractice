/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	public TreeNode searchBST(TreeNode root, int val) {
		TreeNode t = null;

		if (root != null) {
			if (root.val == val) {
				t = root;
			}
			if(t == null){
				t = searchBST(root.left, val);
			}
			if(t == null) {
				t = searchBST(root.right, val);
			}
		}
		return t;
	}
}