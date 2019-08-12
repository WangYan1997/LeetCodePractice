import java.util.*;

public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		TreeNode p = root;
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> level = new ArrayList<>();

		Queue<TreeNode> q = new LinkedList<TreeNode>();

		if (p != null) {
			q.add(p);
		}

		while (!q.isEmpty()) {

			int size = q.size();
			level = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				p = q.poll();
				level.add(p.val);
				if (p.left != null) {
					q.add(p.left);
				}
				if (p.right != null) {
					q.add(p.right);
				}
			}
			res.add(level);
		}

		return res;

	}
}
