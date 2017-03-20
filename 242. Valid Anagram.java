import java.util.HashMap;
import java.util.Iterator;


/**
 * �ж��Ƿ�Ϊ��ζ�ַ���
 * Given two strings s and t, write a function to determine if t is an anagram of s.
For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
 * @author Laura
 *
 */

//��hashmap���ַ���s�������ַ��ͳ��ֵĴ�����
//�����ַ���t��ÿ���ַ�����map���и��ַ�������ַ���Ӧ��value��1����û�У�ֱ�ӷ���false��
//������map��value��������valueֵ��Ϊ0�ģ��򷵻�false
//���������ͨ�����򷵻�true
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
