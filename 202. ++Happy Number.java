import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, 
replace the number by the sum of the squares of its digits, and repeat the process until the number 
equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers 
for which this process ends in 1 are happy numbers.

Example: 19 is a happy number(等号前面的2都是平方)

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 * @author Laura
 *
 */
public class Solution {
	 public static boolean isHappy(int n) {
		 int y = 0;
		 int result = 0;
		 List<Integer> list = new ArrayList<>();     //利用ArrayList类实例化List集合
		 while(result!=1||n!=0){			 
			 y=n%10;
			 n=n/10;
			 result +=y*y;
			 if(n==0&&result!=1){
				 /*将每次平方和存在list中，并用contains()函数判断该结果之前是否出现过，若出现过则会循环，则不是happy number*/
				 if(list.contains(result)){  
					 return false;
				 }
				 else{
					 n=result;
					 list.add(result);
					 result = 0;
				 }
			 }
		 }		 
		 return true;	        
	 }
	 
	 public static void main(String arg[]){
		 Scanner in = new Scanner(System.in);
		 int num = in.nextInt();
		 System.out.println(isHappy(num));
	 }

}
