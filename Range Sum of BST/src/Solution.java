/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
	public int rangeSumBST(TreeNode root, int L, int R) {
		int sum = 0;

		sum = inorder(root, L, R, sum);

		return sum;
	}

	public int inorder(TreeNode root, int L, int R, int sum) {

		if (root != null) {
			if (root.val >= L && root.val <= R) {
				sum = sum + root.val;
				sum = inorder(root.left, L, R, sum);
				sum = inorder(root.right, L, R, sum);
			} else if (root.val < L) {
				sum = inorder(root.right, L, R, sum);
			} else if (root.val > R) {
				sum = inorder(root.left, L, R, sum);
			}

		}

		return sum;
	}
}