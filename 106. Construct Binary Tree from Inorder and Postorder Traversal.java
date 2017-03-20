//���⣺������inorder���ͺ���postorder���������飨���ظ�ֵ�����ع�������

//�ɺ�����������һ����ȷ����ǰ���ĸ��ڵ㣬Ȼ��ȥ����������Ѱ�Ҹø��ڵ㣬�����������иø��ڵ�ǰ��Ϊ������������Ϊ���������ٵݹ飬ֱ��start>end
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
        //��inorder���ҵ���ǰ���ڵ�λ��
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