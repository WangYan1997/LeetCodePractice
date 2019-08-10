public class Solution {
	public int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		
		int leftmaxDepth = maxDepth(root.left);
		int rightmaxDepth = maxDepth(root.right);
		
		return Math.max(leftmaxDepth, rightmaxDepth) + 1;
	}
}