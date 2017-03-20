import java.util.ArrayList;
import java.util.List;

/*
 * Given a binary tree, return all root-to-leaf paths.
 * ���⣺���ҴӸ���Ҷ�ӵ�����·��
 */
//����ÿ���ڵ㣬�õݹ��¼�Ӹ��ڵ㵽ÿ���ڵ��·������Ҷ�ӽڵ㣨root.left==null&&root.right==null������ѵ����Ҷ�ӽڵ��·�����뵽list��
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
