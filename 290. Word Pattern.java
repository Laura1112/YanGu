import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Given a pattern and a string str, find if str follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 * @author Laura
 *
 */

//把str中每个字符串存在list中；
//比对list和pattern的长度，若不相等，则返回false，否则见如下①②③
public class Solution {
    public static boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> map = new HashMap<Character,String>();
        List<String> list = new ArrayList<String>();
        int past = 0;
        for(int i=0;i<str.length();i++){
        	if(str.charAt(i)==' '){
        		list.add(str.substring(past, i));
        		past = i+1;
        	}
        }
        list.add(str.substring(past, str.length()));
        if(list.size()!=pattern.length()){
        	return false;
        }
        else{
        	for(int i=0;i<pattern.length();i++){
        		//①
        		if(!map.containsKey(pattern.charAt(i))&&!map.containsValue(list.get(i))){
        			map.put(pattern.charAt(i), list.get(i));
        		}
        		//②
        		else if(!map.containsKey(pattern.charAt(i))&&map.containsValue(list.get(i))){
        			return false;
        		}
        		//③
        		else if(!map.get(pattern.charAt(i)).equals(list.get(i))){
        			return false;
        		}
        	}
        }
        return true;
    }
    
    public static void main(String[] arg){
    	String pattern = "abba";
    	String str = "avc";
    	System.out.println(wordPattern(pattern,str));
    }
}
