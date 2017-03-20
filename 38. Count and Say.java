/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.
 * @author laura1112
 *
 */

//令初始值s为1，一个一个地读每个数字，直到第n个
//一个一个读s的每一个字符，若与前一个相同则count++，若不同则先读出前面的ns = ns+count+ch，再继续读
//最后要把之前读的字符加上，并s=ns;

public class solution {
	public static String countAndSay(int n) {
        String s = "1";        
        for(int i=1;i<n;i++){
        	int count = 1;
        	String ns="";
        	char ch= s.charAt(0);
        	for(int j=1;j<s.length();j++){
        		if(s.charAt(j)==ch){
        			count++;
        		}
        		else{
        			ns = ns+count+ch;
        			ch = s.charAt(j);
        			count = 1;
        		}
        	}
        	ns = ns+count+ch;
        	s = ns;
        }
        return s;
    }
	
	public static void main(String[] arg){
		int n=4;
		System.out.println(countAndSay(n));
	}
	
}
