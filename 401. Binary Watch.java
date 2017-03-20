import java.util.ArrayList;
import java.util.List;

/**
 * A binary watch has 4 LEDs on the top which represent the hours (0-11), and
 * the 6 LEDs on the bottom represent the minutes (0-59). Each LED represents a
 * zero or one, with the least significant bit on the right. For example, the
 * above binary watch reads "3:25". Given a non-negative integer n which
 * represents the number of LEDs that are currently on, return all possible
 * times the watch could represent. Example: Input: n = 1 Return: ["1:00",
 * "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
 * 
 * @author Laura
 * 
 */


public class Solution {  
    public List<String> readBinaryWatch(int num) {  
       List<String> list = new ArrayList<String>();  
       if(num < 0) return list;  
       for(int h=0; h<12; h++){  
           for(int m=0; m<60; m++){  
               if(Integer.bitCount(h) + Integer.bitCount(m) == num){  
                   list.add(String.format("%d:%02d",h,m));   //%02d表示：占用两位，若m不足两位则在前面补充0 
               }  
           }  
       }  
       return list;  
    }  
    
    public static void main(String[] arg){
    	int num = 2;
    	Solution t = new Solution();
    	List<String> rst = t.readBinaryWatch(num);
    	for(int i=0;i<rst.size();i++)
    		System.out.println(rst.get(i));
    }
}  