//题意：给定两个链表（逆序），表示两个数，求两个数的和，也用链表逆序地表示出来
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8

//从头至尾遍历两个链表，即从个位到高位，定义tag表示进位
//若某个链表便利完，另一个还没遍历完，则接着遍历
//最后勿忘加上tag，因为tag可能为1
//每算完一位，增长链表方式如下
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tag = 0;
        int sum = 0;
        ListNode rst = new ListNode(1);
        ListNode p = rst;   //固定头结点
        while(l1!=null&&l2!=null){
        	sum = l1.val+l2.val+tag;
        	//向后增长链表
        	ListNode next = new ListNode(sum%10);
            rst.next = next;
            rst = rst.next;
            
            tag = sum/10;    //进位
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