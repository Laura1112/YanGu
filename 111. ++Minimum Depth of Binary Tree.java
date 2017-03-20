/*
 * Given a binary tree, find its minimum depth.
 * 题意：找出从最小的度，即根到叶子的最短路径
 */

//与找最大度相比，需要注意根节点只有一颗子树的情况
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
