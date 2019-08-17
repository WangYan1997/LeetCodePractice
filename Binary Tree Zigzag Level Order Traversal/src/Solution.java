
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

class Solution {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		Queue<TreeNode> q = new LinkedList<>();
		boolean flag = true;
		List<Integer> level = new ArrayList<>();

		if (root == null) {
			return ans;
		} else {
			q.add(root);
		}

		while (!q.isEmpty()) {
			int size = q.size();
			level = new ArrayList<>();

			for (int i = 0; i < size; i++) {
				TreeNode p = q.poll();

				if (flag == true) {
					level.add(p.val);
				} else {
					level.add(0, p.val);
				}

				if (p.left != null) {
					q.add(p.left);
				}
				if (p.right != null) {
					q.add(p.right);
				}

			}
			ans.add(level);
			flag = !flag;
		}
		return ans;
	}
}
