/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 * @author Laura
 *
 */

//比较prev和pst的节点值，若相等，则prev.next=nxt,pst =nxt;若不相等prev=pst,pst=nxt;最终返回head
public class Solution {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
        	return head;
        ListNode prev = head;
        ListNode pst = head.next;
        ListNode nxt;
        while(pst!=null){
        	nxt = pst.next;
        	if(pst.val==prev.val){
        		prev.next = nxt;
        		pst = nxt;
        	}
        	else{
        		prev = pst;
        		pst = pst.next;
        	}
        }
        return head;
    }
    
    public static void main(String[] arg){
    	ListNode n0 = new ListNode(0);
    	ListNode n1 = new ListNode(1);
    	ListNode n2 = new ListNode(1);
    	ListNode n3 = new ListNode(2);
    	ListNode n4 = new ListNode(3);
    	n0.next=n1;
    	n1.next=n2;
    	n2.next=n3;
    	n3.next=n4;
    	n4.next=null;
    	ListNode rst = deleteDuplicates(n0);
    	while(rst!=null){
    		System.out.println(rst.val);
    		rst = rst.next;
    	}
    }
}
