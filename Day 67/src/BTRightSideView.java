import java.util.*;

public class BTRightSideView {
	
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
	 
	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        rightview(root, result, 0);
        return result;
    }

	private void rightview(TreeNode root, List<Integer> result, int level) {
		if(root==null){
            return;
        }
        if(result.size()==level){
            result.add(root.val);
        }
        rightview(root.right, result, level+1);
        rightview(root.left, result, level+1);
    }

}
