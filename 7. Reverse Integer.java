import java.util.Scanner;

/**
 * Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.

Have you thought about this?
Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!

If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.

Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?

For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
30000000001
 * @author Laura
 *
 */
public class Solution {
	public static int reverse(int x) { 
		int result = 0;
		int z=x;
		int y;
		while(z!=0){
			y = z%10;
			z = z/10;
			result = result*10+y;
		}
		int i = 0;
		if(x!=0){			
			while(x%Math.pow(10, i)==0){
				i++;
			}
			i--;
		}
		
		int rst = result;
		int rsty;
		int compare = 0;
		while(rst!=0){
			rsty = rst%10;
			rst = rst/10;
			compare = compare*10+rsty;
		}
		compare = (int) (compare*Math.pow(10,i));
		
		
		if(compare!=x)
			result = 0;
		return result;
		
	}

	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(reverse(n));
		
	}
}



























