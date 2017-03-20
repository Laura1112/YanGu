/**
 * Reverse bits of a given 32 bits unsigned integer.
For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).
 * @author laura1112
 *
 */

//反转二进制数，并返回无符号的对应的十进制数
//Integer.toBinaryString(n)转化成二进制字符串，在前面补零到32位
//new StringBuffer(s).reverse().toString()将32位二进制字符串反转
//return Integer.parseUnsignedInt(rs, 2);将无符号的二进制转化成十进制，并返回
public class Solution {
    // you need treat n as an unsigned value   4294967296    2147483648
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        while(s.length()<32)
        	s = '0'+s;
        String rs = new StringBuffer(s).reverse().toString();
        return Integer.parseUnsignedInt(rs, 2);         
    }
    
    public static void main(String[] arg){
    	int n = 4294967;
    	Solution t = new Solution();
    	System.out.println(t.reverseBits(n));
    }
}