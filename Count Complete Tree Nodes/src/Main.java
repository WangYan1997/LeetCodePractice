import java.util.List;

public class Main {
	public static final int NULL = -1;

	public static void main(String[] args) {
//		int[] input = { 5, 1, 6, NULL, 3, NULL, NULL, NULL, NULL, 2, 4 };
//		int[] input = {1, NULL, 2, NULL, NULL, 3};
		int[] input = {1,2,3,4,5,6};

		TreeNode root = Tree(input);

		Solution s = new Solution();
		int count = s.countNodes(root);
		System.out.print(count);
	}

	public static TreeNode Tree(int[] vals) {
		TreeNode root = null;

		int l = vals.length;
		TreeNode[] tree = new TreeNode[l];

		if (l > 0) {
			for (int i = 0; i < l; i++) {
				if (vals[i] != NULL) {
					tree[i] = new TreeNode(vals[i]);
				} else {
					tree[i] = null;
				}
			}
			for (int i = 0; i < l; i++) {
				if (tree[i] == null) {
					continue;
				}
				if (2 * i + 1 < l) {
					tree[i].left = tree[2 * i + 1];
				} else {
					tree[i].left = null;
				}
				if (2 * i + 2 < l) {
					tree[i].right = tree[2 * i + 2];
				} else {
					tree[i].right = null;
				}
			}
			root = tree[0];
		}

		return root;
	}
}
