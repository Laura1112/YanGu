/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */

import java.util.Scanner;



public class AddDigits {
	public static void main(String arg[]){
		Scanner in = new Scanner(System.in);
    	int num = in.nextInt();
    	System.out.println(addDigits(num));
    	
	}
	
    public static int addDigits(int num) {
    	int result=0,k;
    	while(num!=0){
    		k = num%10;
    		num = num/10;
    		result +=k;
    		if(num==0&&result>=10){
    			num = result;
    			result = 0;}
    	}
    	return result;       
    }
}