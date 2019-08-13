import java.util.*;

public class Solution {
	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> ans = new ArrayList<>();

		Stack<TreeNode> stack = new Stack<>();

		TreeNode cur = root;
		while (!stack.isEmpty() || cur != null) {
			while (cur != null) {
				stack.push(cur);
				cur = cur.left;
			}
			cur = stack.pop();
			ans.add(cur.val);
			cur = cur.right;

		}

		return ans;
	}
}
