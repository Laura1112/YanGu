import java.util.LinkedList;
import java.util.Queue;

//���⣺���ҵ���һ��������
public class Solution {
	//��һ���ݹ�
	/*public static TreeNode invertTree(TreeNode root) {
		if(root==null)	return null;	
		TreeNode left = invertTree(root.left);
		TreeNode right = invertTree(root.right);
		root.left = right;
		root.right = left;
		return root;	
    }*/
	//�������ö��У�һ���������Ҵ洢
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
