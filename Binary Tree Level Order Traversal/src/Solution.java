import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	TreeNode p = root;
    	TreeNode last = root;
    	TreeNode nextlast = root;
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	List<Integer> level = new ArrayList<>();
    	
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        if(p != null) {
        	q.add(p);
        }
        
        while( !q.isEmpty()) {
        	 p = q.poll();
        	 level.add(p.val);
        	 if(p.left != null) {
        		 q.add(p.left);
        		 nextlast = p.left;
        	 }
        	 if(p.right != null) {
        		 q.add(p.right);
        		 nextlast = p.right;
        	 }
        	 
        	 if(p == last) {
        		 res.add(level);
        		 level = new ArrayList<>();
        		 last = nextlast;
        	 }
        }
        
        return res;
        
    }
}
