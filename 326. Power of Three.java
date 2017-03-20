import java.util.Scanner;

/**
 * Given an integer, write a function to determine if it is a power of three.
 * 判断一个数是否是3的幂，如3、9、27...

Follow up:
Could you do it without using any loop / recursion?
 * @author Laura
 *
 */
public class Solution {
	public static boolean isPowerOfThree(int n) {
		int y=0;
		while(n!=1){
			y = n%3;
			n = n/3;
			if(y!=0||n==0)
				return false;
		}
		
        return true;
    }
	public static void main(String arg[]){
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println(isPowerOfThree(num));
	}

}
