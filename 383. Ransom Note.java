import java.util.ArrayList;
import java.util.List;

/**
 * given an arbitrary ransom note string and another string containing letters
 * from all the magazines, write a function that will return true if the
 * ransom note can be constructed from the magazines; otherwise, it will return false.
 * Each letter in the magazine string can only be used once in your ransom note.
 * You may assume that both strings contain only lower case letters.
 *  canConstruct("a", "b") -> false
 *  canConstruct("aa", "ab") -> false
 *  canConstruct("aa", "aab") -> true
 * @author laura1112
 *
 */

//题意：判断ransomNote中的每个字符是否在magazine里都有
//把magazine里的每个字符都存到list中
//判断ransomNote中的每个字符在list 中是否存在，遍历ransomNote的每个字符，若存在，则删除list中的该字符，若没有则返回false
public class Solution {
	 public static boolean canConstruct(String ransomNote, String magazine) {
	     List<Character> list = new ArrayList<Character>();
	     for(int i=0;i<magazine.length();i++){
	    	 list.add(magazine.charAt(i));
	     }
	     for(int i=0;i<ransomNote.length();i++){
	    	 if(list.contains(ransomNote.charAt(i)))
	    		 list.remove(list.indexOf(ransomNote.charAt(i)));
	    	 else
	    		 return false;
	     }
	     return true;
	 }
	 
	 public static void main(String[] arg){
		 String ransomNote = "bace";
		 String magazine = "bbca";
		 System.out.println(canConstruct(ransomNote,magazine));
	 }
}
