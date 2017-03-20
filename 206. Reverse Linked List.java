/**
 * Reverse a singly linked list.
 * @author Laura
 *
 */

//以下两种方法都要规定【基准情形】
//递归法：在head后连接一个节点：pst=head.next，再调用自身；再去链并连接：【head.next = null】【p.next = head】 
//迭代法：在head后连接一个节点：pst=head.next，再去链，当pst!=null时，在pst后面连接一个节点nxt,再向前连，再都后移
public class Solution {
    public static ListNode reverseList(ListNode head) {
    	/*法一：递归
    	 * if(head==null) return null;  
        if(head.next==null) return head;  
          
        ListNode p = head.next;  
        ListNode n = reverseList(p);  
        head.next = null;  
        p.next = head;  
        return n;*/  
        
        //法二：迭代
        if(head==null || head.next==null) return head;  
        ListNode pre = head;  
        ListNode p = head.next;  
        pre.next = null;  //去链
        ListNode nxt;  
        while(p!=null) {  
            nxt = p.next;  
            p.next = pre;  //向前连
            pre = p;  
            p = nxt;  
        }  
        return pre;
    }
    
    public static void main(String[] arg){
    	ListNode head = new ListNode(1);
    	ListNode node=new ListNode(2);
    	ListNode tail = new ListNode(3);
    	head.next=node;
    	node.next=tail;
    	tail.next=null;
    	ListNode rst = reverseList(head);
    	while(rst!=null){
    		System.out.println(rst.val);
    		rst = rst.next;
    	}
    }
}
