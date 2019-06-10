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
			else {
				if (val < root.val) {
					t = searchBST(root.left, val);
				}
				else{
					t = searchBST(root.right, val);
				}
			}
		}
		
		return t;
	}
}