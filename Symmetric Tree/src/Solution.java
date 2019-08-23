
public class Solution {
	private boolean isSymmetric = true;

	public boolean isSymmetric(TreeNode root) {

		if (root == null) {
			return true;
		}

		Judge(root.left, root.right);

		return isSymmetric;
	}

	private void Judge(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return;
		} else if (left != null && right != null) {
			if (left.val == right.val) {
				Judge(left.left, right.right);
				Judge(left.right, right.left);
			} else {
				isSymmetric = false;
			}
		} else {
			isSymmetric = false;
		}

	}
}
