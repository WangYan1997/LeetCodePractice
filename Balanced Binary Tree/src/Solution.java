
public class Solution {
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}

		int leftdepth = depth(root.left);
		int rightdepth = depth(root.right);

		int gap = Math.abs((leftdepth - rightdepth));

		if (gap <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
			return true;
		} else {
			return false;
		}
	}

	public int depth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int leftDepth = depth(root.left);
		int rightDepth = depth(root.right);

		return Math.max(leftDepth, rightDepth) + 1;
	}
}
