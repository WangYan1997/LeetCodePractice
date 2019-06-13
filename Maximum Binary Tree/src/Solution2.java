/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution2 {
	public TreeNode constructMaximumBinaryTree(int[] nums) {
		TreeNode root = null;
		int L = 0;
		int R = nums.length;

		root = construct(nums, L, R);

		return root;
	}

	private TreeNode construct(int[] nums, int l, int r) {
		TreeNode root = null;

		if (l == r) {
			return null;
		}
	
		int MaxIndex = l;
		for (int i = l; i < r; i++) {
			if (nums[MaxIndex] < nums[i]) {
				MaxIndex = i;
			}
		}

		root = new TreeNode(nums[MaxIndex]);
		// construct the left subtree and right subtree recursively
		root.left = construct(nums, l, MaxIndex);
		root.right = construct(nums, MaxIndex + 1, r);

		return root;
	}

}