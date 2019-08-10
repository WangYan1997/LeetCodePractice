
class Solution {
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		
		int leftminDepth = minDepth(root.left);
		int rightminDepth = minDepth(root.right);

		if(leftminDepth == 0) {
			return rightminDepth + 1;
		}
		if(rightminDepth == 0) {
			return leftminDepth + 1;
		}
		
		return Math.min(leftminDepth, rightminDepth) + 1;
	}
}
