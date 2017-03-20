//题意：由中序（inorder）和后序（postorder）遍历数组（无重复值），重构二叉树

//由后序数组的最后一个数确定当前树的根节点，然后去中序数组中寻找该根节点，则中序数组中该根节点前即为左子树，后面为右子树，再递归，直至start>end
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return help(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    public TreeNode help(int[] in,int inStart,int inEnd,int[] post,int postStart,int postEnd){
        if(inStart>inEnd||postStart>postEnd){
            return null;
        }
        int rootVal = post[postEnd];
        int rootIdx = 0;
        //在inorder中找到当前根节点位置
        for(int i=0;i<=inEnd;i++){
            if(in[i]==rootVal)
                rootIdx = i;
        }
        TreeNode root = new TreeNode(rootVal);
        int left_len = rootIdx-inStart;
        root.left = help(in,inStart,rootIdx-1,post,postStart,postStart+left_len-1);
        root.right = help(in,rootIdx+1,inEnd,post,postStart+left_len,postEnd-1);
        return root;
    } 
}