import java.util.ArrayList;
import java.util.List;

//以链表形式给出两个数，求和，如7->3->2, 8->2->1->3, 即求732+8213

//因为链表只能从头遍历（即高位），所以先存入list中，然后遍历两个链表进行相加，最后再遍历存入相加结果的list，以构建链表
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 = new ArrayList<>();    //存链表1
        List<Integer> list2 = new ArrayList<>();    //存链表2
        List<Integer> rst = new ArrayList<>();
        while(l1!=null){
            list1.add(l1.val);
            l1 = l1.next;
        }
        while(l2!=null){
            list2.add(l2.val);
            l2 = l2.next;
        }
        int len1 = list1.size();
        int len2 = list2.size();
        int plus = 0;
        int y = 0;
        int i,j;
        for(i=len1-1,j=len2-1;i>=0&&j>=0;i--,j--){
            plus = list1.get(i)+list2.get(j)+y;
            rst.add(plus%10);
            y = plus/10;
        }
        
            while(i>=0){
                plus = list1.get(i)+y;
                rst.add(plus%10);
                y = plus/10;
                i--;
            }
        
        
            while(j>=0){
                plus = list2.get(j)+y;
                rst.add(plus%10);
                y = plus/10;
                j--;
            }
        if(y!=0)
            rst.add(y);
        ListNode root = new ListNode(rst.get(rst.size()-1));
        ListNode n = root;
        for(int k=rst.size()-2;k>=0;k--){
            n.next = new ListNode(rst.get(k));
            n = n.next;
        }
        return root;
    }
}
