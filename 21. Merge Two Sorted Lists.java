import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * @author Laura
 *
 */


//法一：把l1和l2中的节点值都放入list中，用Collections.sort(list)排序，再把list放入新链表中，并返回新链表
//法二：定义一个新链表，比较l1和l2,把较小的值加在新链表后，并后移，等到l1或l2为空时，把剩余的接在新链表后，并返回新链表
public class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	//法一：list排序
    	/*  List<Integer> list = new ArrayList<Integer>();
        ListNode head = new ListNode(0);
        while(l1!=null){
        	list.add(l1.val);
        	l1=l1.next;
        }
        while(l2!=null){
        	list.add(l2.val);
        	l2=l2.next;
        }
        Collections.sort(list);
        ListNode p = head;
        ListNode q = null;
        for(int i=0;i<list.size();i++){
        	p.next = new ListNode(list.get(i));
        	q = p;
        	p = p.next;
        }
        return head.next;*/
    	//法二：纯链表
    	ListNode head = new ListNode(0);
    	ListNode p = head;
    	while(l1!=null&&l2!=null){
    		if(l1.val<=l2.val){
    			p.next = l1;
    			l1 = l1.next;
    			p = p.next;
    		}
    		else{
    			p.next = l2;
    			l2 = l2.next;
    			p = p.next;
    		}
    	}
    	if(l1==null)
    		p.next=l2;
    	else
    		p.next=l1;
    	return head.next;
    		
    }
    
    public static void main(String[] arg){
    	ListNode l1_0 = new ListNode(1);
    	ListNode l1_1 = new ListNode(2);
    	ListNode l1_2 = new ListNode(7);
    	ListNode l2_0= new ListNode(6);
    	ListNode l2_1 = new ListNode(7);
    	l1_0.next = l1_1;
    	l1_1.next = l1_2;
    	l2_0.next = l2_1;
    	
    	ListNode rst = mergeTwoLists(l1_0,l2_0);
    	while(rst!=null){
    		System.out.println(rst.val);
    		rst = rst.next;
    	}
    }
}
