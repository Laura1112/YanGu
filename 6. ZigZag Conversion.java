import java.util.ArrayList;
import java.util.List;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:
string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * @author Laura
 *
 */

//题意：将已知字符串的每个字符摆成“之”字形，然后一行一行地读取字符
//"之"的上下两横：idx = i+(numRows+numRows-2)*line; 
//"之"的斜线上：idx-2*i
public class Solution {
	public static String convert(String s, int numRows) {
		if(numRows==1)
			return s;
		else{
			List<Character> list = new ArrayList<Character>();
			int idx=0;
			int line = 0;
			int i = 0;
			int count = 0;
			while(count<s.length()){
				idx = i+(numRows+numRows-2)*line; 
				if(idx==0||idx==numRows-1){
					while(idx<s.length()){	
						list.add(s.charAt(idx));
						count++;
						line++;
						idx = i+(numRows+numRows-2)*line; 
					}
					line = 0;
					i++;
				}
				else if(idx>0&&idx<numRows-1){
					while(idx<s.length()){
						list.add(s.charAt(idx));
						count++;
						line++;
						idx = i+(numRows+numRows-2)*line;
						if(idx-2*i<s.length()){						
							list.add(s.charAt(idx-2*i));
							count++;
						}
					}
					line = 0;
					i++;
				}
			}
			String rst = "";
			for(int j=0;j<list.size();j++){
				rst = rst+list.get(j);
			}
	        return rst;	
		}
    }
	
	public static void main(String[] arg){
		String s = "AADG";
		System.out.println(convert(s,1));
	}

}


