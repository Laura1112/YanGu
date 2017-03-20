import java.util.ArrayList;
import java.util.List;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
 * @author Laura
 *
 */

//回文中大小写不区分，所以先将所有字母变成小写；
//遍历字符串，将数字和字母存放至list中；
//遍历比较list的首尾，判断是否是回文的。
public class Solution {
    public static boolean isPalindrome(String s) {
    	String t = s.toLowerCase();   //先将所有字母变成小写
        List<Character> list = new ArrayList<Character>();
        for(int i=0;i<t.length();i++){
        	if(t.charAt(i)>='0'&&t.charAt(i)<='9'||t.charAt(i)>='a'&&t.charAt(i)<='z'||t.charAt(i)>='A'&&t.charAt(i)<='Z'){
        		list.add(t.charAt(i));
        	}
        }
        int size = list.size();
        for(int i=0;i<list.size()/2;i++){
        	if(list.get(i)!=list.get(size-i-1))
        		return false;
        }
        return true;
    }
    
    public static void main(String[] arg){
    	String s = "-1aA1";
    	System.out.println(isPalindrome(s));
    }
}