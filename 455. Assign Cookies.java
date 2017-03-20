import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//题意：分饼干，每个小朋友的需求量g[],供应量s[],求最多可以满足多少个小朋友
//先将g[]和s[]排序Arrays.sort();
//然后依次比较两个数组的值，当需求g[i]大于供应s[j]时，j++，当找到最后都没有能满足g[i]时，要break循环，即第i个没有能满足
//最后返回i
public class Solution {
    public static int findContentChildren(int[] g, int[] s) {
    		Arrays.sort(g);
        Arrays.sort(s);
        int i,j;
        for(i=0,j=0;i<g.length&&j<s.length;i++,j++){
	        	while(j<s.length&&g[i]>s[j]){
	        			j++;
	        	}
	        	if(j>=s.length)
	        	    break;
	        }
        return i;
    }
    
    public static void main(String[] args){
    	int[] g = {10,2,3,1,4};   //1,2,3,4,10
    	int[] s = {1,1,3,1,1,1,2};     //1,1,3,11
    	System.out.println(findContentChildren(g,s));
    }
}