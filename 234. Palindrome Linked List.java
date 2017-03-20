import java.util.ArrayList;
import java.util.List;

/**
 * Given a singly linked list, determine if it is a palindrome.
Follow up:
Could you do it in O(n) time and O(1) space?
 * @author laura1112
 *
 */

//该回文指链表值回文！！！
//遍历链表，把所有节点的值以Integer.toString(p.val)的形式（考虑到负数越界问题）存在list中；
//比较list中头尾元素，一对一对地比对，若比对完都相同则回文，否则不
public class Solution {
    public static boolean isPalindrome(ListNode head) {
        List<String> list = new ArrayList<String>();
        ListNode p = head;
        while(p!=null){
        	list.add(Integer.toString(p.val));
        	p = p.next;
        }
        for(int i=0;i<list.size()/2;i++){
        	if(!list.get(i).equals(list.get(list.size()-i-1))){
        		return false;
        	}
        }
        return true;
    }
    
    public static void main(String[] arg){
    	//[-16557,-8725,-29125,28873,-21702,15483,-28441,-17845,-4317,-10914,-10914,-4317,-17845,-28441,15483,-21702,28873,-29125,-8725,-16557]
    	ListNode head = new ListNode(-721);
    	ListNode node1 = new ListNode(-123);
    	ListNode node2 = new ListNode(-123);
    	ListNode tail = new ListNode(-721);
    	head.next=node1;
    	node1.next=node2;
    	node2.next=tail;
    	tail.next=null;
    	System.out.println(isPalindrome(head));
    }
}