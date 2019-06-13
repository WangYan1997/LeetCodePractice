/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = null;
      
        root = construct(nums);
        
		return root;
    }
    
    private TreeNode construct(int[] nums) {
    	TreeNode root = null;
    	
    	int l = nums.length;
    	
    	//find max num(max) and index of max num(MaxIndex) in nums
    	int MaxIndex = -1;
    	int max = -1;
    	
    	if(l > 0) {
    		max = nums[0];
        	for(int i = 0; i < l; i++) {
        		if(max <= nums[i]) {
        			max = nums[i];
        			MaxIndex = i;
        		}
        	}
    	}

    	//get left part subarray(leftnums) and right part subarray(rightnums) divided by the maximum number
    	if(MaxIndex >= 0) {
    		root = new TreeNode(max);
    		
    		int[] leftnums = new int[MaxIndex];
    		int[] rightnums = new int[l-MaxIndex-1];
    		int leftindex = 0;
    		int rightindex = 0;
    		for(int i = 0; i < l; i++) {
    			if(i < MaxIndex) {
    				leftnums[leftindex] = nums[i];
    				leftindex++;
    			}else if(i > MaxIndex) {
    				rightnums[rightindex] = nums[i];
    				rightindex++;
    			}
    		}
    		
    		//construct the left subtree and right subtree recursively
    		root.left = construct(leftnums);
    		root.right = construct(rightnums);
    	}
    	
    	
    	return root;
    }
}