//题意：正序链表，删除重复节点（包括第一个），只留下出现过一次的节点
//Given 1->2->3->3->4->4->5, return 1->2->5.

//遍历链表，比较pst和pre、nxt节点的值，若前后都不想等，则是符合的节点，加入结果链表中，否则跳过
//头尾单独处理
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode pre = head;
        ListNode pst = head.next;
        ListNode nxt = pst.next;
        ListNode dummy = new ListNode(0);
        ListNode rstHead = dummy;
        if(pre.val!=pst.val){
            dummy.next = pre;
            dummy = dummy.next;
        }
        while(nxt!=null){
            if(pst.val!=pre.val&&pst.val!=nxt.val){
                dummy.next = pst;
                dummy = dummy.next;
            }
            pre = pst;
            pst = nxt;
            nxt = nxt.next;
        }
        if(pst.val!=pre.val){
            dummy.next = pst;
            dummy = dummy.next;
        }
        dummy.next = null;
        return rstHead.next;
    }
}