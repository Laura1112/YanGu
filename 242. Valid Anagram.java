import java.util.HashMap;
import java.util.Iterator;


/**
 * 判断是否为异味字符串
 * Given two strings s and t, write a function to determine if t is an anagram of s.
For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
 * @author Laura
 *
 */

//用hashmap存字符串s的所有字符和出现的次数；
//遍历字符串t的每个字符，若map里有该字符，则该字符对应的value减1，若没有，直接返回false；
//最后遍历map的value，若出现value值不为0的，则返回false
//以上情况都通过，则返回true
public class Solution {
	public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
        	if(map.containsKey(s.charAt(i)))
        		map.put(s.charAt(i),map.get(s.charAt(i))+1);
        	else
        		map.put(s.charAt(i), 1);
        }
        for(int j=0;j<t.length();j++){
        	if(map.containsKey(t.charAt(j)))
        		map.put(t.charAt(j), map.get(t.charAt(j))-1);
        	else
        		return false;
        }
        Iterator values = map.values().iterator();
        while(values.hasNext()){
        	Object value = values.next();
        	if(!value.equals(0))
        		return false;
        }
        return true;
    }
	
	public static void main(String[] arg){
		String s = "qwert";
		String t = "wertq";
		System.out.println(isAnagram(s,t));
	}

}
