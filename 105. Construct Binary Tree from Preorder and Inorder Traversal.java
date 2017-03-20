//题意：由中序（inorder）和先序（preorder）遍历数组（无重复值），重构二叉树

//由先序数组的第一个数确定当前树的根节点，然后去中序数组中寻找该根节点，则中序数组中该根节点前即为左子树，后面为右子树，再递归，直至start>end
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return help(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode help(int[] pre,int preStart,int preEnd,int[] in,int inStart,int inEnd){
        if(preStart>preEnd||inStart>inEnd){
            return null;
        }
        int rootVal = pre[preStart];
        int rootIdx = 0;
        for(int i=0;i<=inEnd;i++){
            if(in[i]==rootVal)
                rootIdx = i;
        }
        TreeNode root = new TreeNode(rootVal);
        int left_len = rootIdx - inStart;
        root.left = help(pre,preStart+1,preStart+left_len,in,inStart,rootIdx-1);
        root.right = help(pre,preStart+left_len+1,preEnd,in,rootIdx+1,inEnd);
        return root;
    }
}