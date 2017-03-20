/**
 * Given a linked list, remove the nth node from the end of list and return its head.
For example,
   Given linked list: 1->2->3->4->5, and n = 2.
   After removing the second node from the end, the linked list becomes 1->2->3->5.
 * @author Laura
 *
 */

//遍历计算链表长度；
//for循环查找要删除的节点，删掉
public class Solution {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode q = head;
		int len=0;
		while(q!=null){
			len++;
			q=q.next;
		}
		ListNode preHead = new ListNode(0);
		ListNode pre = preHead;
		ListNode p = head;
		pre.next = p;
        for(int i=0;i<len-n;i++){
        	pre = p;
        	p = p.next;
        }
        pre.next = p.next;
        p.next = null;
        return preHead.next;    
    }
	
	public static void main(String[] arg){
		ListNode head = new ListNode(1);
    	ListNode node=new ListNode(2);
    	ListNode tail = new ListNode(3);
    	head.next=node;
    	node.next=tail;
    	tail.next=null;
    	ListNode rst = removeNthFromEnd(head,2);
    	while(rst!=null){
    		System.out.println(rst.val);
    		rst = rst.next;
    	}
	}

}
