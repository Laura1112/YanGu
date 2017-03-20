import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//题意：给链表排序

//遍历链表，把所有值都存入list中，然后用Collections.sort(list)进行排序
//再遍历list，构成一个新的链，即为所求
public class Solution {
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);
        ListNode node = new ListNode(0);
        ListNode nodeHead = node;
        for(int i=0;i<list.size();i++){
            node.next = new ListNode(list.get(i));
            node = node.next;
        }
        return nodeHead.next;
    }
}
