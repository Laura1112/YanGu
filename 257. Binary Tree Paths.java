import java.util.ArrayList;
import java.util.List;

/*
 * Given a binary tree, return all root-to-leaf paths.
 * 题意：查找从根到叶子的所有路径
 */
//遍历每个节点，用递归记录从根节点到每个节点的路径，当叶子节点（root.left==null&&root.right==null），则把到达该叶子节点的路径加入到list中
public class Solution {
	List<String> list = new ArrayList<String>();
	public List<String> binaryTreePaths(TreeNode root) {		
		if(root==null) return list;
		findPath(root,Integer.toString(root.val));
		return list;
	}
	
	public void findPath(TreeNode root,String path){
		if(root.left==null&&root.right==null)  list.add(path);
		if(root.left!=null)	findPath(root.left,path+"->"+root.left.val);
		if(root.right!=null)	findPath(root.right,path+"->"+root.right.val);
	}
}
