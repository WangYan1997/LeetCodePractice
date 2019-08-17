import java.util.*;

public class Solution {
	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> ans = new ArrayList<>();

		Stack<TreeNode> stack = new Stack<>();

		TreeNode curr = root;
		while (!stack.isEmpty() || curr != null) {
			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			ans.add(curr.val);
			curr = curr.right;

		}

		return ans;
	}
}
