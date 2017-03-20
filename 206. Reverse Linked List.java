/**
 * Reverse a singly linked list.
 * @author Laura
 *
 */

//�������ַ�����Ҫ�涨����׼���Ρ�
//�ݹ鷨����head������һ���ڵ㣺pst=head.next���ٵ���������ȥ�������ӣ���head.next = null����p.next = head�� 
//����������head������һ���ڵ㣺pst=head.next����ȥ������pst!=nullʱ����pst��������һ���ڵ�nxt,����ǰ�����ٶ�����
public class Solution {
    public static ListNode reverseList(ListNode head) {
    	/*��һ���ݹ�
    	 * if(head==null) return null;  
        if(head.next==null) return head;  
          
        ListNode p = head.next;  
        ListNode n = reverseList(p);  
        head.next = null;  
        p.next = head;  
        return n;*/  
        
        //����������
        if(head==null || head.next==null) return head;  
        ListNode pre = head;  
        ListNode p = head.next;  
        pre.next = null;  //ȥ��
        ListNode nxt;  
        while(p!=null) {  
            nxt = p.next;  
            p.next = pre;  //��ǰ��
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
