import java.util.*;

public class Solution {
	public List<Integer> inorderTraversal(TreeNode root) {
		
		List<Integer> ans = new ArrayList<>();
		if (root == null) {
			return ans;
		}	

		Stack<TreeNode> stack = new Stack<>();

		stack.push(root);
		TreeNode p = root.left;
		while (!stack.isEmpty() || p != null) {
			if (p != null) {
				stack.push(p);
				p = p.left;
			} else {
				TreeNode q = stack.pop();
				ans.add(q.val);
				p = q.right;
			}
		}

		return ans;
	}
}
