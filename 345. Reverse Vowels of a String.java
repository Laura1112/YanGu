import java.util.ArrayList;
import java.util.List;

/**
 * Write a function that takes a string as input and reverse only the vowels of a string.
Example 1:
Given s = "hello", return "holle".
Example 2:
Given s = "leetcode", return "leotcede".
 * @author Laura
 *
 */

//��sת�������飻
//ͷβָ��ֱ�ָ������Ŀ�ͷ�ͽ�β�����ж��Ƿ�ΪԪ����ĸ��
//��������ΪԪ����ĸʱ��ͨ��tmpt����λ�ã������ƶ�ָ�롣
public class Solution {
	public static String reverseVowels(String s) {
		char[] c = s.toCharArray();   //���ַ���sת��������char[] c 
		int start = 0;
		int end = c.length-1;
		char tmpt;
		while(start<end){
			if(isVowel(c[start])&&isVowel(c[end])){
				tmpt = c[start];
				c[start] = c[end];
				c[end] = tmpt;
				start++;
				end--;
			}
			else if(!isVowel(c[start])&&isVowel(c[end]))
				start++;
			else if(isVowel(c[start])&&!isVowel(c[end]))
				end--;
			else{
				start++;
				end--;
			}
		}	
		return new String(c); 	//������char[] c���ַ�����ʽ����	
    }
	
	/**
	 * �ж��Ƿ�ΪԪ����ĸ
	 * @param c
	 * @return
	 */
	public static boolean isVowel(char c){
		//��Ҫ���Ǵ�д������
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			return true;
		return false;
	}
	
	public static void main(String[] arg){
		String s = "helloleetcoda";
		System.out.println(reverseVowels(s));
	}

}
