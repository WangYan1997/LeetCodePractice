import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public void recoverTree(TreeNode root) {
		
		//get vals of all nodes
		ArrayList<Integer> vals = new ArrayList<>();
		getVals(root, vals);
		Collections.sort(vals);
				
		bulidTree(vals, 0, vals.size() - 1, root);
	}

	private void bulidTree(ArrayList<Integer> vals, int lo, int hi, TreeNode root) {
		if(lo > hi) {
			return;
		}

		int left = getNodeNum(root.left);
		root.val = vals.get(lo + left);
		
		bulidTree(vals, lo, lo + left - 1, root.left);
		bulidTree(vals, lo + left + 1, hi, root.right);
		
	}

	/**
	 * 
	 * @param root
	 * @param vals
	 */
	private void getVals(TreeNode root, ArrayList<Integer> vals) {
		if (root == null) {
			return;
		}
		vals.add(root.val);
		getVals(root.left, vals);
		getVals(root.right, vals);
	}

	/**
	 * 获得当前root所包含的结点数
	 * @param root
	 * @return
	 */
	private int getNodeNum(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return getNodeNum(root.left) + getNodeNum(root.right) + 1;
		}
	}

}
