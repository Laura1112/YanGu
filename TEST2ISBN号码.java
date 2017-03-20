import java.util.Scanner;


public class Main {
	public static String ISBN(String s){
		String result = null;
		int code = 0;
		int j = 1;
		for(int i=0;i<s.length()-2;i++){
			if(s.charAt(i)=='-'){
				
			}
			else{
				code += (s.charAt(i)-48)*j;
				j++;
			}
		}
		code %= 11;
		if(code==10){
			code = 'X';
			if(code==s.charAt(s.length()-1))
				result = "Right";
			else
				result = s.substring(0,s.length()-1)+(char)code;
		}
		else{
			if(code==s.charAt(s.length()-1)-48)
				result = "Right";
			else
				result = s.substring(0, s.length()-1)+code;
		}
		return result;
	}
	
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(ISBN(s));
	}

}
