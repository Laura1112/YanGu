//题意：将一个单项链表按照奇数点在前、偶数点在后的顺序重新链接，如
/*Given 1->2->3->4->5->NULL,
return 1->3->5->2->4->NULL.
*/
//定义两个链的头节点，分别为odd和even，然后遍历原链表，odd.next=odd.next.next; evev.next=evev.next.next;直到even==null或even.next==null
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head!=null){
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = even;
            while(even!=null&&even.next!=null){
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }
        return head;
    }
}