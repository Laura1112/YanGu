import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//题意：用给定的字符串可以组成的最长回文字符串的长度
//用map存储字符和出现的次数
//遍历map的value，若为偶数直接加上value，若为奇数，加上value-1，且tag为1（初始值为0）；
//最后加上tag
public class Solution {
    public static int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
        	if(map.containsKey(s.charAt(i)))
        		map.replace(s.charAt(i), map.get(s.charAt(i))+1);
        	else
        		map.put(s.charAt(i), 1);
        }
        
        int length = 0;  
        int tag = 0;
        Iterator<Integer> values = map.values().iterator();
        while(values.hasNext()){
        	int value = (Integer) values.next();
        	if(value%2==0)
        		length += value; 
        	else{ 
        		length += value-1;
        		tag = 1;
        	}
        }     
        length += tag;
        return length;       
    }
    public static void main(String[] arg){
    	String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherf";
    	System.out.println(longestPalindrome(s));
    }
}