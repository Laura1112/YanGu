
/*
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such 
 * that adding up all the values along the path equals the given sum.
 * ���⣺�Ӹ��ڵ㵽Ҷ�ӽڵ��Ƿ����ܺ͵���sum��·������㣺�����յ㣺Ҷ�ӽڵ㣩
 */

//���������ݹ飬����Ϊif(root.val==sum&&root.left==null&&root.right==null)    return true;
public class Solution {
	public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)   return false;
        if(root.val==sum&&root.left==null&&root.right==null)    return true;
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
