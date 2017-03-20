/**
 * Remove all elements from a linked list of integers that have value val.
Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
 * @author laura1112
 *
 */


public class Solution {
    public static ListNode removeElements(ListNode head, int val) {
    	ListNode newHead = new ListNode(0);
    	newHead.next = head;
        ListNode p = head;
        ListNode pre = newHead;
        while(p!=null){
        	if(p.val==val){
        		pre.next = p.next;
        		p = p.next;
        	}
        	else{
        		pre = p;
        		p = p.next;       	
        	}
        }
        return newHead.next;
    }
    
    public static void main(String[] arg){
    	ListNode head = new ListNode(2);
    	ListNode node1 = new ListNode(2);
    	ListNode node2 = new ListNode(3);
    	ListNode tail = new ListNode(1);
    	int val = 2;
    	head.next=node1;
    	node1.next=node2;
    	node2.next=tail;
    	tail.next=null;
    	ListNode rst = removeElements(head,val);
    	while(rst!=null){
    		System.out.println(rst.val);
    		rst = rst.next;
    	}
    }
}