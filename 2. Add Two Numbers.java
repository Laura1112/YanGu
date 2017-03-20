//���⣺���������������򣩣���ʾ�����������������ĺͣ�Ҳ����������ر�ʾ����
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8

//��ͷ��β���������������Ӹ�λ����λ������tag��ʾ��λ
//��ĳ����������꣬��һ����û�����꣬����ű���
//�����������tag����Ϊtag����Ϊ1
//ÿ����һλ����������ʽ����
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tag = 0;
        int sum = 0;
        ListNode rst = new ListNode(1);
        ListNode p = rst;   //�̶�ͷ���
        while(l1!=null&&l2!=null){
        	sum = l1.val+l2.val+tag;
        	//�����������
        	ListNode next = new ListNode(sum%10);
            rst.next = next;
            rst = rst.next;
            
            tag = sum/10;    //��λ
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
        	sum = l1.val+tag;
        	
        	ListNode next = new ListNode(sum%10);
            rst.next = next;
            rst = rst.next;
            
        	tag = sum/10;
        	l1 = l1.next;
        }
        while(l2!=null){
        	sum = l2.val+tag;
        	
        	ListNode next = new ListNode(sum%10);
            rst.next = next;
            rst = rst.next;
            
        	tag = sum/10;
        	l2 = l2.next;
        }
        if(tag!=0){
        	ListNode next = new ListNode(tag);
            rst.next = next;
            rst = rst.next;
        }
        return p.next;
    }
}