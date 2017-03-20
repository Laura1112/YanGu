import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//���⣺����������������

//��root��������ڵ㶼����stack�У�����ڵ�������ˣ���ȡջ��Ԫ�أ�����rst��list��
//Ȼ���ٿ��ýڵ����������������������ڵ㣬ͬ��Ҳ����������ڵ�
//���ֱ����ջΪ�գ���cur==null
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> rst = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while(cur!=null||!s.isEmpty()){
            while(cur!=null){
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            rst.add(cur.val);
            cur = cur.right;
        }
        return rst;
    }
}
