/**
 * Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 */

import java.util.Scanner;

public class Solution {
    public static int titleToNumber(String s) {
        int result = 0;
        for(int i=0;i<s.length();i++){
        	result = result*26+(int)s.charAt(i)-64;
        }
        return result;
    }
    
    public static void main(String arg[]){
    	String s;
    	Scanner in = new Scanner(System.in);
    	s = in.nextLine();
    	System.out.println(titleToNumber(s));
    }
}