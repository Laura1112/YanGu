/*
 * Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.
 */

import java.util.HashMap;
import java.util.Map;

//题意：把一个数（包括负数）转化成十六进制数
//把10-15对应的a－f存放在hashmap中，对十进制数不断取余，算出十六进制数
//负数先转化成正数：z = (long) (Math.pow(2, 32)+num);
public class Solution {
    public String toHex(int num) {
    	long z = 0;
    	String rst="";
    	if(num<0){
    		z = (long) (Math.pow(2, 32)+num);
    	}
    	else if(num>0)	
    		z = num;
    	else if(num==0)
    		return rst="0";
        int y;
        Map<Integer,Character> map = new HashMap<Integer,Character>();
        map.put(10, 'a');
        map.put(11, 'b');
        map.put(12, 'c');
        map.put(13, 'd');
        map.put(14, 'e');
        map.put(15, 'f');
        while(z!=0){
        	y = (int) (z%16);
        	z = z/16;
        	if(y>9)
        		rst = map.get(y)+rst;
        	else
        		rst = y+rst;
        }
        return rst;
    }
    
    public static void main(String[] arg){
    	Solution t = new Solution();
    	System.out.println(t.toHex(-1));
    }
}