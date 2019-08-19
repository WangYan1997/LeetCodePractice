import java.util.List;

public class Main {

public static final int NULL = -1;
	
	public static void main(String[] args) {
		int[] input = {3, 9, 20, NULL, NULL, 15, 7};
//		int[] input = {1, NULL, 2, 3};
//		int[] input = {1,2,3,4,NULL,NULL,5};
//		int[] input = {1,2,3,4,5,6,7,8,9,NULL,NULL,10,NULL,11,NULL};
//		int[] input = {3,9,20,NULL,NULL,15,7};
		
		TreeNode root = Tree(input);
		
		Solution s = new Solution();
		List<List<Integer>> list = s.zigzagLevelOrder(root);
		System.out.print(list);
		
		System.out.println();
		Solution2 s2 = new Solution2();
		List<List<Integer>> list2 = s2.zigzagLevelOrder(root);
		System.out.print(list2);
	}
	
	public static TreeNode Tree(int[] vals) {
		TreeNode root = null;
		
		int l = vals.length;
		TreeNode[] tree = new TreeNode[l];
		
		if(l > 0) {
			for(int i = 0; i < l; i++) {
				if(vals[i] != NULL) {
					tree[i] = new TreeNode(vals[i]);
				}else {
					tree[i] = null;
				}
			}
			for(int i = 0; i < l; i++) {
				if(tree[i] == null) {
					continue;
				}
				if(2*i+1 < l) {
					tree[i].left = tree[2*i+1];
				}else {
					tree[i].left = null;
				}
				if(2*i+2 < l) {
					tree[i].right = tree[2*i+2];
				}else {
					tree[i].right = null;
				}
			}
			root = tree[0];
		}
		
		return root;
	}

}
