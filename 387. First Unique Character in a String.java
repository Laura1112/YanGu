import java.util.ArrayList;
import java.util.List;

/*
 * Given a string, find the first non-repeating character in it and return it's index.
 * If it doesn't exist, return -1.
 * 定位第一个在整个字符串中其他位置从未出现过的字符所在位置，返回index
 */
//遍历字符串，先看list中是否存在该字符，若存在表示在之前出现过，
//不存在再与该字符的其后字符串比对，若不存在相同的字符，则返回index，否则加入list中
public class Solution {
    public static int firstUniqChar(String s) {
    	List<Character> list = new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
        	if(!list.contains(s.charAt(i))){
	        	if(!s.substring(i+1).contains(s.charAt(i)+"")){
	        		return i;
	        	}
	        	else
	        		list.add(s.charAt(i));
        	}        		
        }
        return -1;
    }
    
    public static void main(String[] arg){
    	String s = "lewleetcowde";
    	System.out.println(firstUniqChar(s));
    }
}