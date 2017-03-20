import java.util.Scanner;

/**
 * Given an integer n, return the number of trailing zeroes in n!.
 * @author Laura
 *
 */
public class Solution {
	 public static int trailingZeroes(int n) {
	        int result = 0;
	        int mi = (int) (Math.log(n)/Math.log(5));
	        for(int i=1;i<=mi;i++){
	        	result += n/Math.pow(5, i);
	        }
	        return result;
	 }
	 
	 public static void main(String[] arg){
		 Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		 System.out.println(trailingZeroes(n));
	 }

}
