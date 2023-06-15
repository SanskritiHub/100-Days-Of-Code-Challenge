public class countGoodNodesInBT {

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
	
	public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        return dfs(root, root.val);
    }

	private int dfs(TreeNode root, int max) {
		if(root == null) return 0;

        max = Math.max(max, root.val);

        if(root.val>=max){
            return 1 + dfs(root.left, max) + dfs(root.right, max);
        }
        else{
            return dfs(root.left, max) + dfs(root.right, max);
        }
    }
	 
}
