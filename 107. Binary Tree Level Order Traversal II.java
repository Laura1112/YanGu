import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

//题意：从上到下，存储每层的值
//计算该树的深度，将每个节点存放在HashMap中，具体形式为map.put(node,第几层);
//若发现层数与之前的不同，就把之前那一层的所有节点都放入结果的list中
public class Solution {
	public static List<List<Integer>> levelOrder(TreeNode root) {
		if(root==null) return null;
		else{
			int depth = depth(root);
			List<Integer> list = new ArrayList<Integer>();
	        List<List<Integer>> rst = new ArrayList<List<Integer>>();
	        Map<TreeNode,Integer> map = new HashMap<>();
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        queue.add(root);
	        map.put(root, depth);
	        list.add(root.val);
	        TreeNode left,right;	
	        int tmp = depth;
	        while(!queue.isEmpty()){
	        	root = queue.poll();
	        	left = root.left;
	        	right = root.right;
	        	if(left!=null){
	        		queue.add(left);
	        		map.put(left, map.get(root)-1);
	        		if(map.get(root)-1==tmp)
	        			list.add(left.val);
	        		else{
	        			rst.add(list);
	        			list = new ArrayList<Integer>();
	        			list.add(left.val);
	        			tmp =  map.get(root)-1;
	        		}
	        	}
	        	if(right!=null){
	        		queue.add(right);
	        		map.put(right, map.get(root)-1);	
	        		if(map.get(root)-1==tmp)
	        			list.add(right.val);
	        		else{
	        			rst.add(list);
	        			list = new ArrayList<Integer>();
	        			list.add(right.val);
	        			tmp =  map.get(root)-1;
	        		}
	        	}
	        }	   
	        rst.add(list);
	        return rst;       
		}
    }
	
	private static int depth(TreeNode root){
		if(root==null)
			return 0;
		else{
			int leftDepth = depth(root.left);
			int rightDepth = depth(root.right);
			return leftDepth>=rightDepth ? leftDepth+1:rightDepth+1;
		}		
	}
	
	public static void main(String[] args){
		 TreeNode root = new TreeNode(3);
		 TreeNode l1 = new TreeNode(0);
		 TreeNode l2 = new TreeNode(9);
		 TreeNode r1 = new TreeNode(6);
		 TreeNode r2 = new TreeNode(5);
		 root.left = l1;
		 root.right = r1;
		 l1.left = l2;
		 l2.right = r2;		
		 System.out.println(levelOrder(root));
	}

}
