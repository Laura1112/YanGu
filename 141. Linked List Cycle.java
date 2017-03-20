import java.util.ArrayList;
import java.util.List;

/**
 * Given a linked list, determine if it has a cycle in it.
Follow up:
Can you solve it without using extra space?
 * @author Laura
 *
 */

//从头至尾遍历链表，并把每个节点存在list中，每加入一个节点前都判断一下是否已存在，若存在，则返回true，若遍历到最后则返回false
public class Solution {
	public static boolean hasCycle(ListNode head) {
		if(head==null) return false;		
		List<ListNode> list = new ArrayList<ListNode>();
		ListNode p = head;
		ListNode nxt;
		while(p.next!=null){
			if(list.contains(p))
				return true;
			else{
				list.add(p);
				p=p.next;
			}
		}
		return false;     
    }
	
	 public static void main(String[] arg){
	    	ListNode head = new ListNode(1);
	    	ListNode node=new ListNode(2);
	    	ListNode tail = new ListNode(3);
	    	ListNode tail1 = new ListNode(-4);
	    	head.next=node;
	    	node.next=tail;
	    	tail.next=tail1;
	    	tail1.next = node;
	    	boolean rst = hasCycle(head);
	    	System.out.println(rst);
	    }

}
