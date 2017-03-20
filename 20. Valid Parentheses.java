import java.util.ArrayList;
import java.util.List;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * @author Laura
 *
 */

//���⣺����ƥ�䣨��ջ��ջ��
//��list�洢������([{��������������)]}ʱ����list�е����һ���ַ��ȶԣ������ϣ���ɾ�������򷵻�false
//��Ҫ����list���Ѿ�û���ַ��ˣ��������ű������Ŷ࣬�򷵻�false
//���listΪ�գ�����true�����򷵻�false
public class Solution {
	public static boolean isValid(String s) {
        List<Character> list = new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
        		list.add(s.charAt(i));
        	else{
        		//ƥ��()
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
        		//ƥ��[]        		
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
        		//ƥ��{}
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
