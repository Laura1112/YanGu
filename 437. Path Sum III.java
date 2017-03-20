import java.util.LinkedList;
import java.util.Queue;

//���⣺�ڶ������ϲ��Һ�Ϊsum��·���ж���������ָ����ʼλ�ú���ֹλ�ã�ֻҪ����ϵ���
//˫��ݹ飬һ���ݹ�����ڵ㣬��ʾ�Ӹýڵ㿪ʼ����Ч·����һ�������ýڵ�һ�µĽڵ��Ƿ��ܹ���һ����Ч��·
//int rst = pathSum(root.left,sum)+pathSum(root.right,sum)+presentSum(root,sum);
//rst += presentSum(root.left,sum-root.val)+presentSum(root.right,sum-root.val);	
public class Solution {
	public int pathSum(TreeNode root, int sum) {
        if(root==null)  return 0;
        int rst = pathSum(root.left,sum)+pathSum(root.right,sum)+presentSum(root,sum);
        return rst;
    }
	
	private int presentSum(TreeNode root, int sum){
		int rst = 0;
		if(root==null)
			return 0;
		if(root.val==sum)
			rst++;
		rst += presentSum(root.left,sum-root.val)+presentSum(root.right,sum-root.val);					
		return rst;
	}

	public static void main(String[] args){
		
	}
}
