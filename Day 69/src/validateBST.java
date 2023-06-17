public class validateBST {

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
	
	public static boolean validBST(TreeNode root) {
		return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}
	
	public static boolean valid(TreeNode root, long start, long end) {
		if(root==null) {
			return true;
		}
		
		if(start<root.val && root.val<end) {
			return valid(root.left, start, root.val) && valid(root.right, root.val, end);
		}
		
		return false;
	}
}
