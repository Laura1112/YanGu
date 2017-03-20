
/*
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such 
 * that adding up all the values along the path equals the given sum.
 * 题意：从根节点到叶子节点是否有总和等于sum的路径（起点：根，终点：叶子节点）
 */

//左右子树递归，出口为if(root.val==sum&&root.left==null&&root.right==null)    return true;
public class Solution {
	public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)   return false;
        if(root.val==sum&&root.left==null&&root.right==null)    return true;
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
