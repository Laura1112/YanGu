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

//将s转化成数组；
//头尾指针分别指向数组的开头和结尾，并判断是否为元音字母；
//当两个都为元音字母时，通过tmpt调换位置，否则移动指针。
public class Solution {
	public static String reverseVowels(String s) {
		char[] c = s.toCharArray();   //将字符串s转化成数组char[] c 
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
		return new String(c); 	//将数组char[] c以字符串形式返回	
    }
	
	/**
	 * 判断是否为元音字母
	 * @param c
	 * @return
	 */
	public static boolean isVowel(char c){
		//需要考虑大写！！！
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			return true;
		return false;
	}
	
	public static void main(String[] arg){
		String s = "helloleetcoda";
		System.out.println(reverseVowels(s));
	}

}
