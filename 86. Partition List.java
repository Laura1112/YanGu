//题意：将链表中所有小于x的节点放在前面，其余的相对顺序与愿链表保持一致

//分别用两个链表存小于x的节点和其他节点，最后连起来
//注意：末位要置空！！！！！
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode minor = new ListNode(0);
        ListNode minorHead = minor;
        ListNode major = new ListNode(0);
        ListNode majorHead = major;
        while(head!=null){
            if(head.val<x){
                minor.next = head;
                minor = minor.next;
            }
            else{
                major.next = head;
                major = major.next;
            }
            head = head.next;
        }
        major.next = null;      //末位元素一定要置空！！！！！
        minor.next = majorHead.next;
        return minorHead.next;
    }
}