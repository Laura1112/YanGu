import java.util.LinkedList;
import java.util.Queue;

//题意：在二分查找树上查找某两个节点的最近公共根节点
//广度优先遍历二分查找树，若某个根的值出于p，q中间，则找到所求节点，否则继续遍历
public class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q)	return root;
        else{
        	Queue<TreeNode> queue = new LinkedList<TreeNode>();
        	queue.add(root);
        	TreeNode left,right;
        	while(!queue.isEmpty()){
        		root = queue.poll();
        		if((root.val>=p.val&&root.val<=q.val)||(root.val<=p.val&&root.val>=q.val))
        			return root;
        		else{
        			left = root.left;
        			right = root.right;
        			if(left!=null)	queue.add(left);
        			if(right!=null) queue.add(right);
        		}
        	}
        }
        return null;
    }
	
	public static void main(String[] arg){
		 
	}

}
