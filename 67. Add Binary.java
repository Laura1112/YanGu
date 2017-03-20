import java.util.Scanner;

/**
 * Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 * @author Laura
 *��������������ӣ������ʾΪ��������
 *˼·1����λ�����ٵ��Ǹ����ĸ�λ����0��ʹ��������λ����ȣ�����������ǰ����һ��0���������Ա�֤�����λ������������λ��һ�£�
 *	  ����tagλ����ʾ��λ����������һ�����
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
			//3��1
			if(num==147){
				result = "1"+result;
				tag = '1';
			}
			//2��1
			else if(num==146){
				result = "0"+result;
				tag = '1';
			}
			//1��1
			else if(num==145){
				result = "1"+result;
				tag = '0';
			}
			//0��1
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
