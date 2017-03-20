//���⣺������inorder��������preorder���������飨���ظ�ֵ�����ع�������

//����������ĵ�һ����ȷ����ǰ���ĸ��ڵ㣬Ȼ��ȥ����������Ѱ�Ҹø��ڵ㣬�����������иø��ڵ�ǰ��Ϊ������������Ϊ���������ٵݹ飬ֱ��start>end
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