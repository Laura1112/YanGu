/**
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3
 * @author Laura
 *
 */

//题意：一个数转化成二进制数，求其中1的个数
//用Integer.toBinaryString(n)将转化成二进制字符串，然后遍历数字符串中1的个数
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int count = 0;
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)=='1')
        		count++;
        }
        return count;
    }
    
    public static void main(String[] arg){
    	int n = 32;
    	Solution t = new Solution();
    	System.out.println(t.hammingWeight(33));
    }
}