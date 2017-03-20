import java.util.ArrayList;
import java.util.List;

//题意：把链表重新排序
/*Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
You must do this in-place without altering the nodes' values.
*/

//遍历链表，把元素存入list中，然后保持head，遍历list，将两端值一个一个连起来
public class Solution {
    public void reorderList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode n = head;
        while(n!=null){
            list.add(n.val);
            n = n.next;
        }
        int size = list.size();
        ListNode node = head;
        int i;
        for(i=1;i<(size+1)/2;i++){
            node.next = new ListNode(list.get(size-i));
            node = node.next;
            node.next = new ListNode(list.get(i));
            node = node.next;
        }
        //若有偶数个元素，则最后剩一个，需加入链（此时要保证不为空）
        if(size%2==0&&head!=null){
            node.next = new ListNode(list.get(i));
        }
    }
}