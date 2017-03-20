/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * @author Laura
 *
 */


//题意：两数相加，不用+-号
//设a，b为两个二进制数，则a+b = a^b + (a&b)<<1 ， 直到(a&b)==0
public class Solution {
	public int bitAdd(int a,int b){	
		if(b==0)
	        return a;
		//异或
	    int sum = a^b;    
	    //进位
	    int carry =(a&b)<<1;
	    //递归
	    return bitAdd(sum,carry);
	 }
    
    public static void main(String[] arg){
    	Solution t = new Solution();
    	System.out.println(t.bitAdd(-10, 8));
    }
}

