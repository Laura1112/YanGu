import java.util.LinkedList;
import java.util.Queue;

//题意：在二叉树上查找和为sum的路径有多少条，不指定起始位置和终止位置，只要求从上到下
//双层递归，一个递归遍历节点，表示从该节点开始的有效路径，一个遍历该节点一下的节点是否能构成一条有效的路
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
