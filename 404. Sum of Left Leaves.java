import java.util.LinkedList;
import java.util.Queue;

//题意：求二叉树中左子叶的和
//先根遍历，把所有节点存储到queue中，若其本身为左节点，且无子孙，则在结果上加上它的值
public class Solution {
	public static int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
        	return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode left;
        TreeNode right;
        int rst = 0;
        queue.add(root);
        while(!queue.isEmpty()){
        	root = queue.poll();
        	left = root.left;
        	right = root.right;
        	if(left!=null){
        		queue.add(left);
        		if(left.left==null&&left.right==null)	
        			rst += left.val;
        	}
        	if(right!=null) queue.add(right);
        	
        }
        return rst;
    }
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		TreeNode n1 = new TreeNode(2);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(2);
		TreeNode n4 = new TreeNode(2);
		TreeNode n5 = new TreeNode(2);
		TreeNode n6 = new TreeNode(2);
		root.left = n1;
		root.right = n2;
		n1.left = n3;
		n2.left = n4;
	
		System.out.println(sumOfLeftLeaves(root));
		
	}
}
