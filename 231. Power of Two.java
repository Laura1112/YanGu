import java.util.Scanner;

/**
 * Given an integer, write a function to determine if it is a power of two.
 * 判断一个数是不是2的幂，如2、4、8、16...
 * @author Laura
 *
 */
public class Solution {
	public static boolean isPowerOfTwo(int n) {
		int y=0;
		while(n!=1){
			y = n%2;
			n = n/2;
			if(y!=0||n==0)
			return false;
	}
	
    return true;
}
public static void main(String arg[]){
	Scanner in = new Scanner(System.in);
	int num = in.nextInt();
	System.out.println(isPowerOfTwo(num));
}
}
