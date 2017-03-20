
public class Solution {
	 public static int maxDepth(TreeNode root) {
		 int depth = 0;
		 if(root!=null){
			 int leftDepth = maxDepth(root.left);
			 int rightDepth = maxDepth(root.right);
			 depth=leftDepth>=rightDepth?leftDepth+1:rightDepth+1;
		 }
		 return depth;
	 }
	 
	 public static void main(String[] args){
		 TreeNode root = new TreeNode(3);
		 TreeNode l1 = new TreeNode(0);
		 TreeNode l2 = new TreeNode(8);
		 TreeNode r1 = new TreeNode(6);
		 TreeNode r2 = new TreeNode(5);
		 root.left = l1;
		 root.right = r1;
		 l1.left = l2;
		 System.out.println(maxDepth(root));
	 }
}
