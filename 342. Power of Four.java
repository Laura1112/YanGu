/*
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
Example:
Given num = 16, return true. Given num = 5, return false.
Follow up: Could you solve it without loops/recursion?
 */

//题意：判断一个数是否数4的幂
//若为负数，返回false
//将需要判断的数转成二进制Integer.toBinaryString(num)
//如果二进制数中还有不止一个1，或者长度是2的倍数，（若是4的倍数，则二进制数中的1只能在2的偶数次幂的位置出现）则返回false，否则返回true
public class Solution {
    public boolean isPowerOfFour(int num) {
    	if(num<=0)
    		return false;
        String s = Integer.toBinaryString(num);
        if(s.lastIndexOf('1')!=s.indexOf('1')||s.length()%2==0){
        	return false;
        }
        return true;
    }
    
    public static void main(String[] arg){
    	Solution t = new Solution();
    	System.out.println(t.isPowerOfFour(0));
    }
}