import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * You are playing the following Bulls and Cows game with your friend: You write down a number and ask your friend to guess what the number is. Each time your friend makes a guess, you provide a hint that indicates how many digits in said guess match your secret number exactly in both digit and position (called "bulls") and how many digits match the secret number but locate in the wrong position (called "cows"). Your friend will use successive guesses and hints to eventually derive the secret number.
For example:
Secret number:  "1807"
Friend's guess: "7810"
Hint: 1 bull and 3 cows. (The bull is 8, the cows are 0, 1 and 7.)
Write a function to return a hint according to the secret number and friend's guess, use A to indicate the bulls and B to indicate the cows. In the above example, your function should return "1A3B".
Please note that both secret number and friend's guess may contain duplicate digits, for example:
Secret number:  "1123"
Friend's guess: "0111"
In this case, the 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow, and your function should return "1A1B".
You may assume that the secret number and your friend's guess only contain digits, and their lengths are always equal.
 * @author Laura
 *
 */

//从头开始遍历两个字符串，若同一位置数字相同，则bull++,否则分别在list1和list2中加入两个字符串该位置的数字，为后面比对cow做准备
//遍历list2, 若list1中存在这个数字，则删除list1.remove(list1.lastIndexOf(list2.get(i)))，并cow++;
//最后返回rst = bull+"A"+cow+"B";
public class Solution {
    public static String getHint(String secret, String guess) {
    	List<Character> list1 = new ArrayList<Character>();
    	List<Character> list2 = new ArrayList<Character>();
    	int bull=0,cow=0;
    	String rst;
    	int j=0;
        for(int i=0;i<secret.length();i++){
        	if(secret.charAt(i)==guess.charAt(i))
        		bull++;
        	else{
        		list1.add(j, secret.charAt(i));
        		list2.add(j, guess.charAt(i));
        		j++;
        	}
        }
        for(int i=0;i<list2.size();i++){
        	if(list1.contains(list2.get(i))){
        		list1.remove(list1.lastIndexOf(list2.get(i)));
        		cow++;
        	}
        }
        rst = bull+"A"+cow+"B";
        return rst;
    }
    
    public static void main(String[] arg){
    	String a="08352";
    	String b="08255";
    	System.out.println(getHint(a,b));
    }
}
