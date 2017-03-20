/*
 * Given a binary tree, find its minimum depth.
 * ���⣺�ҳ�����С�Ķȣ�������Ҷ�ӵ����·��
 */

//����������ȣ���Ҫע����ڵ�ֻ��һ�����������
//
public class Solution {
	public int minDepth(TreeNode root) {
        if(root==null)  return 0;
        if(root.left==null&&root.right==null)  return 1;
        int left=0,right=0;
        if(root.left!=null)
            left = minDepth(root.left);
        if(root.right!=null)
            right = minDepth(root.right);
        if(left==0){
            return right+1;
        }
        else if(right==0)
            return left+1;
        return left<=right?left+1:right+1;
    }
}
