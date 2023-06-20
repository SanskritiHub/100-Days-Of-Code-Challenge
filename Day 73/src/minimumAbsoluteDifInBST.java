public class minimumAbsoluteDifInBST {
	
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	    int intMinDiff = Integer.MAX_VALUE;
	    TreeNode prev;

	    public int getMinimumDifference(TreeNode root) 
	    {
	        inorder(root);
	        return intMinDiff;
	    }

	    public void inorder(TreeNode root)
	    {
	        if(root != null)
	        {
	            inorder(root.left);
	            if(prev != null)
	            {
	                intMinDiff 
	                    = Math.min(intMinDiff, root.val - prev.val );
	            }
	            prev = root;
	            inorder(root.right);
	        }
	    }
}
	
