import java.util.Scanner;

/**
 * Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 * @author Laura
 *两个二进制数相加，结果表示为二进制数
 *思路1：在位数较少的那个数的高位补充0，使两个数的位数相等，再在两个数前补充一个0，这样可以保证最后结果位数与两个数的位数一致；
 *	  设置tag位，表示进位，从右往左一次相加
 * */
public class Solution {
	public static String addBinary(String a, String b) {
		String result = null ;
		int num;
		int al = a.length();
		int bl = b.length();
		while(al>bl){
			b = "0"+b;
			bl++;
		}
		while(al<bl){
			a = "0"+a;
			al++;
		}
		a = "0"+a;
		b = "0"+b;
		char tag = '0';
		al = a.length();
		bl = b.length();
		while(al>0&&bl>0){
			num = a.charAt(al-1)+b.charAt(bl-1)+tag;
			//3个1
			if(num==147){
				result = "1"+result;
				tag = '1';
			}
			//2个1
			else if(num==146){
				result = "0"+result;
				tag = '1';
			}
			//1个1
			else if(num==145){
				result = "1"+result;
				tag = '0';
			}
			//0个1
			else if(num==144){
				result = "0"+result;
				tag = '0';
			}
			al--;
			bl--;
		}
		if(result.charAt(0)=='0')
			result = result.substring(1,result.length()-4);
		else
			result = result.substring(0,result.length()-4);
		return result;        
    }
	
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		System.out.println(addBinary(a,b));
		in.close();
	}
	

}
