import java.util.LinkedList;
import java.util.Queue;

//题意：判断两棵二叉树是否完全相同
//先根遍历把每个节点存放在两个队列里，依次如下（1）（2）两种情况
public class Solution {
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		//特殊情况
        if(p==null&&q==null)	return true;
        else if(p==null&&q!=null)	return false;
        else if(p!=null&&q==null)	return false;
        //一般情况
        else{
        	Queue<TreeNode> queueP = new LinkedList<TreeNode>();
        	Queue<TreeNode> queueQ = new LinkedList<TreeNode>();
        	queueP.add(p);
        	queueQ.add(q);
        	TreeNode rootP,rootQ,leftP,leftQ,rightP,rightQ;
        	while(!queueP.isEmpty()&&!queueQ.isEmpty()){
        		rootP = queueP.poll();
        		rootQ = queueQ.poll();
        		//（1）️比较根节点，值不同则返回false
        		if(rootP.val!=rootQ.val)		
        			return false;
        		leftP = rootP.left;
        		rightP = rootP.right;
        		leftQ = rootQ.left;
        		rightQ = rootQ.right;
        		//（2）判断是否出现一个有左节点，另一个没有；或者一个有右节点，另一个没有
        		if(((leftP==null)^(leftQ==null))||((rightP==null)^(rightQ==null)))
        			return false;
        		//将所有非空节点加入对应的队列
        		if(leftP!=null) queueP.add(leftP);
        		if(rightP!=null) queueP.add(rightP);
        		if(leftQ!=null) queueQ.add(leftQ);
        		if(rightQ!=null) queueQ.add(rightQ);
        	}
        	//比对完若有一个队列不为空，则返回false
        	if(!queueP.isEmpty()||!queueQ.isEmpty())
        		return false;
        	return true;       	
        }
    }
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(3);
		TreeNode n0 = new TreeNode(2);
		TreeNode n1 = new TreeNode(4);
		TreeNode n2 = new TreeNode(5);
		TreeNode n3 = new TreeNode(6);
		TreeNode n4 = new TreeNode(7);
		TreeNode n5 = new TreeNode(8);
		
		//root.left = n0;
		/*root.right = n1;
		
		n0.left = n2;
		n0.right = n3;
		
		n1.left = n4;
		n1.right = n5;*/
	
		
		TreeNode root1 = new TreeNode(2);
		TreeNode n01 = new TreeNode(2);
		TreeNode n11 = new TreeNode(4);
		TreeNode n21 = new TreeNode(5);
		TreeNode n31 = new TreeNode(6);
		TreeNode n41 = new TreeNode(7);
		TreeNode n51 = new TreeNode(8);

		
		//root1.right = n01;
		/*root1.right = n11;
		
		n01.left = n21;
		n01.right = n31;
		
		n11.left = n41;
		n11.right = n51;*/
		System.out.println(isSameTree(root,root1));
		
	}

}
