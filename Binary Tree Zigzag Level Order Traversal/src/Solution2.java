
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;

class Solution2 {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		Stack<TreeNode> p = new Stack<>(); // 正向栈
		Stack<TreeNode> q = new Stack<>(); // 反向栈
		boolean flag = true;
		List<Integer> level = new ArrayList<>();

		if (root == null) {
			return ans;
		} else {
			p.push(root);
		}

		while (!p.isEmpty() || !q.isEmpty()) {
			if (flag == true) {
				int size = p.size();
				level = new ArrayList<>();

				for (int i = 0; i < size; i++) {
					TreeNode curr = p.pop();
					level.add(curr.val);

					if (curr.left != null) {
						q.push(curr.left);
					}
					if (curr.right != null) {
						q.push(curr.right);
					}
				}

			} else {
				int size = q.size();
				level = new ArrayList<>();

				for (int i = 0; i < size; i++) {
					TreeNode curr = q.pop();
					level.add(curr.val);
					if (curr.right != null) {
						p.push(curr.right);
					}
					if (curr.left != null) {
						p.push(curr.left);
					}
				}
			}
			ans.add(level);
			flag = !flag;
		}
		return ans;
	}
}
