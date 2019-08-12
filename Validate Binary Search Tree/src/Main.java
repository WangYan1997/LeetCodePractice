
public class Main {

	public static final int NULL = -1;
	
	public static void main(String[] args) {
//		int[] input = {1,1}; // false
//		int[] input = {10,5,15,NULL,NULL,6,20}; //false
		int[] input = {3,1,5,0,2,4,6,NULL,NULL,NULL,3}; //false
//		int[] input = {2,1,3}; //true
//		int[] input = {3,1,5,0,2,4,6}; //true
		
		TreeNode root = Tree(input);
		
		Solution s = new Solution();
		boolean isBST = s.isValidBST(root);
		System.out.print(isBST);
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
