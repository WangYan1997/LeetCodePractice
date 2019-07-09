
public class Main {
	public static final int NULL = -1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] input1 = {3,5,1,6,2,9,8,NULL,NULL,7,4};
//		int[] input2 = {3,5,1,6,7,4,2,NULL,NULL,NULL,NULL,NULL,NULL,9,8};
		
		int[] input1 = {1,2};
		int[] input2 = {2,2};
		
		TreeNode root1 = Tree(input1);
		TreeNode root2 = Tree(input2);
		
		Solution s = new Solution();
		boolean isSimilar = s.leafSimilar(root1, root2);
		System.out.println(isSimilar);
		
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
