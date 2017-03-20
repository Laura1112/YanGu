/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * �жϻ�����
 * ˼·��
 * ע������Ҫ��O(1)�ռ临�Ӷȣ�ע�⸺�����ǻ�����(x>=0)��

˼·1������������ת���ɵ����һ���������ٱȽ�ת��ǰ����������Ƿ���ȣ�����������Ҫ����Ŀռ俪��

˼·2��ÿ����ȡͷβ���������ж������Ƿ���ȣ��жϺ�ȥ��ͷβ��������
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
		//����������
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
