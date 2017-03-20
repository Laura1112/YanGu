/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
If the last word does not exist, return 0.
Note: A word is defined as a character sequence consists of non-space characters only.
For example, 
Given s = "Hello World",
return 5.
 * @author laura1112
 *
 */

//题意：判断最后一个单词的长度
//从后往前读，若最后几个是空格，则继续往前读，直到读到非空格
//读到非空格后开始计数，并继续向前读，直到又读到空格
//注意：所有往前读的过程中都要判断是否已读完，即idx>=0
public class Solution {
	public static int lengthOfLastWord(String s) {
		int rst=0;
		int idx = s.length()-1;
        while(idx>=0&&s.charAt(idx)==' ')
        	idx--;
        while(idx>=0&&s.charAt(idx)!=' '){
        	rst++;
        	idx--;
        }
        return rst;
    }
	
	public static void main(String[] arg){
		String s = " r ";
		System.out.println(lengthOfLastWord(s));
	}
}
