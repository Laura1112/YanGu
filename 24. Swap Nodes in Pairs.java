/**
 * Given a linked list, swap every two adjacent nodes and return its head.
For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.
Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 * @author Laura
 *
 */

public class Solution {
    public static ListNode swapPairs(ListNode head) {
    	//法一：自己写的
    	if(head==null||head.next==null)  return head;
    	else{
    		ListNode pre = head;
    		ListNode newhead = head.next;
    		ListNode cur = newhead;
    		ListNode nxt;
    		while(cur!=null){
    			nxt = cur.next;
    			cur.next = pre;
    			if(nxt!=null){
    				//偶数个节点
    				if(nxt.next!=null)
    					pre.next = nxt.next;   					
    				//奇数个节点
    				else
    					pre.next = nxt;
    				pre = nxt;
	    			cur = pre.next;
    			}   
    			else{
    				cur = null;
    				pre.next = null;
    			}
    		}
    		return newhead;
    		
    	}
    	
    	//法二:网上代码
    	/*if(head == null)  
            return null;  
        ListNode helper = new ListNode(0);  
        helper.next = head;  
        ListNode pre = helper;  
        ListNode cur = head;  
        while(cur!=null && cur.next!=null)  
        {  
            ListNode next = cur.next.next;  
            cur.next.next = cur;  
            pre.next = cur.next;  
            if(next!=null && next.next!=null)  
                cur.next = next.next;  
            else  
                cur.next = next;  
            pre = cur;  
            cur = next;  
        }  
        return helper.next; */ 
    }
    
    public static void main(String[] arg){
    	ListNode head = new ListNode(1);
    	ListNode node=new ListNode(2);
    	ListNode tail = new ListNode(3);
    	//ListNode tail1 = new ListNode(4);
    	head.next=node;
    	node.next=tail;
    	//tail.next=tail1;
    	ListNode rst = swapPairs(head);
    	while(rst!=null){
    		System.out.println(rst.val);
    		rst = rst.next;
    	}
    }
}
