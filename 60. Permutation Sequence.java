import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//[1,2,3,��,n]����n!��������ϣ����k��
/*����ʽ����
"123"
"132"
"213"
"231"
"312"
"321"*/

//��������������
/*
k1 = k-1;
a1 = k1 / (n-1)!

k2 = k1 % (n-1)! 
a2 = k2 / (n-2)!

k3 = k2 % (n-2)!
a3 = k3 / (n-3)!
...*/
//��a1a2a3a4...��Ϊ����
public class Solution {
    public static String getPermutation(int n, int k) {
        String rst = "";
        List<Integer> list = new ArrayList<Integer>();
        int jie=1;
        for(int i=0;i<n;i++){
        	list.add(i+1);
        	jie *=(i+1);
        }
        int a;
        k=k-1;
        for(int i=0;i<n;i++){
        	jie = jie/(n-i);
        	a = k/jie;
        	rst += list.get(a);
        	list.remove(a);
        	k = k%jie;       	
        }
        return rst;
    }
    
    public static void main(String[] args){
    	int n = 3;
    	int k = 5;
        System.out.println(getPermutation(n,k));
    }
}