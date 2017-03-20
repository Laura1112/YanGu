import java.util.LinkedList;
import java.util.Queue;

//���⣺�ڶ��ֲ������ϲ���ĳ�����ڵ������������ڵ�
//������ȱ������ֲ���������ĳ������ֵ����p��q�м䣬���ҵ�����ڵ㣬�����������
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
