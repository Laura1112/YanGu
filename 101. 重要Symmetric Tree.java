import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//题意：判读一个树是不是对称的
/*
 * 递归，左子树的左和右子树的右相等，左子树的右和右子树的左相等，才能保证对称
 */
public class Solution {

	
	public boolean isSymmetric(TreeNode root) {
		if(root==null) 	return true;
		return isSymmetric(root.left,root.right);
	}
	
	public boolean isSymmetric(TreeNode l,TreeNode r){
		if(l==null&&r==null) return true;
		if(l==null^r==null||l.val!=r.val)	return false;
		return isSymmetric(l.left,r.right)&&isSymmetric(l.right,r.left);
	}
	
	
//以下方法超时
/*	public boolean isSymmetric(TreeNode root) {
		if(root==null||(root.left==null&&root.right==null))
            return true;
        TreeNode r = root;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<TreeNode> tmpt = new LinkedList<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        queue.add(root);
        list.add(root.val);
        int count = 1;
        list = new ArrayList<Integer>();
        TreeNode left,right;
        while(!queue.isEmpty()&&count<Math.pow(2,depth(r))-2){
            root = queue.poll();
            if(root==null){
                left = null;
                right = null;
            }
            else{
                left = root.left;
                right = root.right;
            }
            tmpt.add(left);
            tmpt.add(right);
            list.add(left==null?null:left.val);
            count++;
            list.add(right==null?null:right.val);
            count++;
            if(queue.isEmpty()){
                queue = tmpt;
                tmpt = new LinkedList<TreeNode>();
                for(int i=0;i<list.size()/2;i++){
                    if(list.get(i)!=list.get(list.size()-i-1))
                        return false;
                }
                list = new ArrayList<Integer>();
            }
        }
        return true;
    }
    
    private int depth(TreeNode root){
        if(root==null)  return 0;
        int left = depth(root.left);
        int right = depth(root.right);
        int rst = left>right?left+1:right+1;
        return rst;
    }
    */
/*	
	 * 中序遍历
	 
	public void midOrder(TreeNode root,List<Integer> list){
		if(root==null) return;	//递归的出口，即遍历完直接啥都不返回
		if(root.left!=null)		//左
			midOrder(root.left,list);
		list.add(root.val);		//中
		if(root.right!=null){	//右
			midOrder(root.right,list);
		}
	}
 */
}
