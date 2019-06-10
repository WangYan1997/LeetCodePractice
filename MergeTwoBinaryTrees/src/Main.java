
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] t1 = {1,3,2,5};
//		int[] t2 = {2,1,3,(Integer) null,4,(Integer) null,7};
		
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(2);
		TreeNode t4 = new TreeNode(5);
		
		t1.left = t2;
		t1.right = t3;
		
		t2.left = t4;
		t2.right = null;
		
		t3.left = null;
		t3.right = null;
		
		t4.left = null;
		t4.right = null;
		
		TreeNode a1 = new TreeNode(2);
		TreeNode a2 = new TreeNode(1);
		TreeNode a3 = new TreeNode(3);
		TreeNode a4 = new TreeNode(4);
		TreeNode a5 = new TreeNode(7);
		
		a1.left = a2;
		a1.right = a3;
		
		a2.left = null;
		a2.right = a4;
		
		a3.left = null;
		a3.right = a5;
		
		a4.left = null;
		a4.right = null;
		
		a5.left = null;
		a5.left = null;
		
		
		Solution s = new Solution();
		TreeNode newtree = s.mergeTrees(t1, a1);
		 
		TreeNode tempt = newtree;
	}

}
