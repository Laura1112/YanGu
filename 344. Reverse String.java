/**
 * Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
 * @author laura1112
 *
 */


public class Solution {
    public static String reverseString(String s) {
    //法一（会超时）：用charAt从后往前读字符，并存入rst中，最后返回
        /*String rst = "";
        for(int i=s.length()-1;i>=0;i--){
        	rst =rst+s.charAt(i);
        }
        return rst;*/
    	
    //法二（AC）：直接使用StringBuffer类的reverse方法
   	 return new StringBuffer(s).reverse().toString();
    }
    
    public static void main(String[] arg){
    	String s = "hello";
    	System.out.println(reverseString(s));
    }
}