import java.util.Scanner;

/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
 * @author Laura
 *
 */
public class Solution {
	public static String convertToTitle(int n) {
		String result = null;
		int z=n;
		int y;
		while(z!=0){
			y = z%26;
			if(y==0){
				result = (char)(26+64)+result;
				z = z-26;
			}
			else
				result = (char)(y+64)+result;
			z = z/26;			
		}
		result = result.substring(0,result.length()-4);
		return result;
        
    }
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(convertToTitle(n));
	}

}
