import java.util.LinkedList;
import java.util.Queue;

//题意：左右倒置一个二叉树
public class Solution {
	//法一：递归
	/*public static TreeNode invertTree(TreeNode root) {
		if(root==null)	return null;	
		TreeNode left = invertTree(root.left);
		TreeNode right = invertTree(root.right);
		root.left = right;
		root.right = left;
		return root;	
    }*/
	//法二：用队列，一层层从左至右存储
	public static TreeNode invertTree(TreeNode root) {
		if(root==null)	return null;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode current = queue.poll();
			TreeNode temp = current.left;
			current.left = current.right;
			current.right = temp;
			if(current.left!=null)  queue.add(current.left);
			if(current.right!=null) queue.add(current.right);
		}
		return root;		
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
		 System.out.println(invertTree(root).right.val);
	 }
}
