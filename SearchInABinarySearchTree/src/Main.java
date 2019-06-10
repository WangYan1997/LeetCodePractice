

public class Main {

	public static final int NULL = -1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vals = {4,2,7,1,3};
		int val = 2;
		
		TreeNode root = Tree(vals);
		
		Solution s = new Solution();
		TreeNode findroot = s.searchBST(root, val);
		
		if(findroot != null) {
			System.out.println(findroot.val);
		}
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
