import java.util.ArrayList;
import java.util.List;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
For example, the following two linked lists:

A:          a1 �� a2
                                                           �K
                     c1 �� c2 �� c3
                                                           �J            
B:     b1 �� b2 �� b3
begin to intersect at node c1.
Notes:
If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
 * @author Laura
 *
 */

//������A��ÿ���ڵ����list�У��ٱ�������B��������ĳ���ڵ���list���Ѵ��ڣ��򷵻ظýڵ㣬��ʼ��û�ҵ��ýڵ㣬�򷵻�null
public class Solution {
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        List<ListNode> list = new ArrayList<ListNode>();
        while(p!=null){
        	list.add(p);
        	p=p.next;
        }
        p = headB;
        while(p!=null){
        	if(list.contains(p))
        		return p;
        	else{
        		p=p.next;
        	}
        }
        return null;
    }
	
	public static void main(String[] arg){
		ListNode headA = new ListNode(1);
    	ListNode nodeA=new ListNode(2);
    	ListNode tailA = new ListNode(3);
    	headA.next=nodeA;
    	nodeA.next=tailA;
    	
    	ListNode headB = new ListNode(1);
    	ListNode nodeB=new ListNode(2);
    	ListNode tailB = new ListNode(3);
    	headB.next=nodeB;
    	nodeB.next=tailA;
    	
    	ListNode rst = getIntersectionNode(headA,headB);
    	System.out.println(rst.val);
	}

}
