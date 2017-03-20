import java.util.ArrayList;
import java.util.List;

//题意：找出一个带环的链表是从哪个位置开始重复的，如1->2->3->4，其中4->1，则返回第一个节点，即1

//遍历链表，并存入list中，判断当前节点head是否已存在，存在则表示有链，且从head开始
//若遍历至最后，都没有重复的则返回null
public class Solution {
    public ListNode detectCycle(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while(head!=null){
            if(list.contains(head))
                return head;
            else{
                list.add(head);
                head = head.next;
            }
        }
        return null;
    }
}