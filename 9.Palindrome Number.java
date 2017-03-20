/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * 判断回文数
 * 思路：
 * 注意问题要求O(1)空间复杂度，注意负数不是回文数(x>=0)。

思路1：将输入整数转换成倒序的一个整数，再比较转换前后的两个数是否相等，但是这样需要额外的空间开销

思路2：每次提取头尾两个数，判断它们是否相等，判断后去掉头尾两个数。
 */

import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(int x) {
		int p=0,y=0,z=x;
		while(z!=0){
			p = z%10;
			z = z/10;
			y = y*10+p;
		}
		if(y==x&&x>=0)
        	return true;
		else
			return false;
    }
	
	public static void main(String arg[]){
		Scanner in = new Scanner(System.in);
		int k=in.nextInt();
		System.out.println(isPalindrome(k));
	}
	
	/*public static void main(String arg[]){
	    
	     int y = 0,r = 0;
		Scanner in = new Scanner(System.in);
		int k=in.nextInt();
		int i = k;
		//以下是主体
		while(i!=0){
			r = i%10;
			i = i/10;
			y = y*10+r;			
		}
		in.close();
		if(y==k){
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}*/
}
