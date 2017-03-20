import java.util.ArrayList;
import java.util.List;

//二叉排序树又叫二叉查找树. BST的定义左 < 中 < 右。 BST的中序遍历必定是严格递增的。
//题意：将一个正序的链表变成一个二分查找树

//遍历链表，将元素存入list中，然后递归（中间的即为根节点，中间偏左是左子树，中间偏右是右子树）
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)  return null;
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        return help(list,0,list.size()-1);
        
    }
    
    public TreeNode help(List<Integer> list,int left,int right){
        if(left>right)  return null;   		//递归的一个出口
        if(left==right) return new TreeNode(list.get(left));		//递归的另一个出口
        int mid = left+(right-left)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = help(list,left,mid-1);			//递归的左子树
        root.right = help(list,mid+1,right);			//递归的右子树
        return root;
    }
}