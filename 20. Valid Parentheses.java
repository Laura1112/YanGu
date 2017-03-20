import java.util.ArrayList;
import java.util.List;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * @author Laura
 *
 */

//题意：括号匹配（出栈入栈）
//用list存储左括号([{，当遇到右括号)]}时，与list中的最后一个字符比对，若符合，则删除，否则返回false
//需要考虑list中已经没有字符了，即右括号比左括号多，则返回false
//最后list为空，返回true，否则返回false
public class Solution {
	public static boolean isValid(String s) {
        List<Character> list = new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
        		list.add(s.charAt(i));
        	else{
        		//匹配()
        		if(s.charAt(i)==')'){
        			if(list.isEmpty())
        				return false;
        			else{
        				if(list.get(list.size()-1)!='(')
        					return false;
        				else
        					list.remove(list.size()-1);
        			}
        		}
        		//匹配[]        		
        		if(s.charAt(i)==']'){
        			if(list.isEmpty())
        				return false;
        			else{
        				if(list.get(list.size()-1)!='[')
        					return false;
        				else
        					list.remove(list.size()-1);
        			}
        		}
        		//匹配{}
        		if(s.charAt(i)=='}'){
        			if(list.isEmpty())
        				return false;
        			else{
        				if(list.get(list.size()-1)!='{')
        					return false;
        				else
        					list.remove(list.size()-1);
        			}
        		}
        	}
        }
        if(list.isEmpty())
        	return true;
        else
        	return false;
    }
	
	public static void main(String[] arg){
		String s = ")";
		System.out.println(isValid(s));
	}
}
