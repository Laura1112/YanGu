import java.util.LinkedList;
import java.util.Queue;

//题意：判断是否为平衡二叉树（各个节点的左右子树的度的差值不大于1）
//用递归求每个左右子节点的度，并比较差值Math.abs(l-r)
public class Solution {
	public boolean isBalanced(TreeNode root) {
        if(root==null)  return true;
        Queue<TreeNode> queue = new LinkedList<TreeNode>(); 
        queue.add(root);
        TreeNode left,right;
        while(!queue.isEmpty()){
            root = queue.poll();
            left = root.left;
            right = root.right;
            int l=0,r=0;
            if(left!=null){
                queue.add(left);
                l = depth(left);
            }
            if(right!=null){
                queue.add(right);
                r = depth(right);
            }
            if(Math.abs(l-r)>1)
                return false;
        }
        return true;
    }
    public int depth(TreeNode root){
        if(root == null) return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        return left>=right?left+1:right+1;
    }

}
