import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//[1,2,3,…,n]包含n!个排列组合，求第k个
/*排序方式如下
"123"
"132"
"213"
"231"
"312"
"321"*/

//从左至右找数，
/*
k1 = k-1;
a1 = k1 / (n-1)!

k2 = k1 % (n-1)! 
a2 = k2 / (n-2)!

k3 = k2 % (n-2)!
a3 = k3 / (n-3)!
...*/
//把a1a2a3a4...即为所求串
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