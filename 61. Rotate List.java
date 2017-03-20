//题意：链表轮回
/*Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.*/

//先求链表长度len，若k是len的整数倍，则链表无需变化
//否则，遍历链表至len-k%len的地方，即断开的地方
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int len = 0;
        //求链表长度
        ListNode node = head;
        while(node!=null){
            len++;
            node = node.next;
        }
        if(len==0||k%len==0)    return head;
        int target = len-k%len;
        ListNode front = head;
        //寻找断开的地方，新链表的头为front.next，尾为front
        for(int i=1;i<target;i++){
            front = front.next;
        }
        ListNode newNode = front.next;
        ListNode newHead = newNode; //新头
        while(newNode.next!=null){
            newNode = newNode.next;
        }
        newNode.next = head;    //原链表的末位连上原链表的头
        front.next = null;      //链表末尾要置空
        return newHead;
    }
}