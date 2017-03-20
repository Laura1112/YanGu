import java.util.ArrayList;
import java.util.List;

/*
 * Given a string, find the first non-repeating character in it and return it's index.
 * If it doesn't exist, return -1.
 * ��λ��һ���������ַ���������λ�ô�δ���ֹ����ַ�����λ�ã�����index
 */
//�����ַ������ȿ�list���Ƿ���ڸ��ַ��������ڱ�ʾ��֮ǰ���ֹ���
//������������ַ�������ַ����ȶԣ�����������ͬ���ַ����򷵻�index���������list��
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