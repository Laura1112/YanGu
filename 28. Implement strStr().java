/**
 * Implement strStr().
Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * @author Laura
 *
 */

//从前往后一个一个匹配，时间复杂度o(m*n)
public class Solution {
    public static int strStr(String haystack, String needle) {
    	int H = haystack.length();
    	int N = needle.length();
    	if(N==0) return 0;
    	int j;
    	//注意此处i<H-N
        for(int i=0;i<=H-N;i++){
        	for(j=0;j<N;j++){
        		if(haystack.charAt(i+j)==needle.charAt(j)){
        			continue;
        		}
        		else{       		
        			j=0;
        			break;
        		}       			
        	}
        	if(j==N){return i;}
        }
        return -1;
    }
    
    public static void main(String[] arg){
    	String haystack = "mississippi";
    	String needle = "mississippi";
    	System.out.println(strStr(haystack,needle));
    }
}