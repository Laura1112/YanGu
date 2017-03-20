//题意：把一个链表的第m到第n个逆序，求新链

//m到n从后向前连
//第m-1个连到现在的第m个，也就是原来的第n个［m－1位留好标志位］
//现在的第n个（即原来的第m个）连到第n＋1个，若n等于链长，则要置空，否则内存溢出［原m位留好标志位］
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n)    return head;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        head = newHead;
        for(int i=1;i<m;i++){
            head = head.next;
        }
        ListNode pre = head.next;
        ListNode last = pre;
        ListNode node = pre.next;
        ListNode temp = new ListNode(0);
        //从node向pre连（m到n从后向前连）
        for(int i=m;i<n;i++){
            temp = node.next;
            node.next = pre;
            pre = node;
            node = temp;
        }
        //第m-1个连到现在的第m个，也就是原来的第n个
        head.next = pre;
        //现在的第n个（即原来的第m个）连到第n＋1个，若n等于链长，则要置空，否则内存溢出
        if(node!=null)
            last.next = node;
        else
            last.next = null;
        
        return newHead.next;
        
    }
}