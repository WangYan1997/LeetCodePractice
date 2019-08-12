
public class Solution {
	public boolean isValidBST(TreeNode root) {
		return recursive(root, null, null);
	}

	public boolean recursive(TreeNode root , TreeNode left, TreeNode right) {
		if (root == null) {
			return true;
		}

		if(left != null && root.val <= left.val) {
			return false;
		}
		if(right != null && root.val >= right.val) {
			return false;
		}
		
		return recursive(root.left, left, root) && recursive(root.right, root, right);
	}
}
