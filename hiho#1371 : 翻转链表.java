import java.util.Scanner;

//链表逆序（不使用多余空间）
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n!=-1){
            Node head = new Node();
            head.value = in.nextInt();
            Node node = head;
            for(int i=1;i<n;i++){
            	int k = in.nextInt();
                node.next = new Node();
                node.next.value = k;
                node = node.next;
            }
            Node pre = null;
            Node now = head;
            Node next = new Node();
            while(now!=null){
            	next = now.next;
                now.next = pre;
                pre = now;
                now = next;                
            }
            Node rstNode = pre;
            while(rstNode.next!=null){
                System.out.print(rstNode.value+" ");
                rstNode = rstNode.next;
            }
            System.out.println(rstNode.value);
            n = in.nextInt();
        }
    }
}

class Node
    {
        int value;
        Node next;
    }
