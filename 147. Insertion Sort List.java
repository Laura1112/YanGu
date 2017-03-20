import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//题意：用插入排序法对链表排序

//以下方法同148题，直接用list排序，虽AC，但不符合题意
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);
        ListNode node = new ListNode(0);
        ListNode newHead = node;
        for(int i=0;i<list.size();i++){
            node.next = new ListNode(list.get(i));
            node = node.next;
        }
        return newHead.next;
    }
}

