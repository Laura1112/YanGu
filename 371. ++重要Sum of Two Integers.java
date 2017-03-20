/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * @author Laura
 *
 */


//���⣺������ӣ�����+-��
//��a��bΪ����������������a+b = a^b + (a&b)<<1 �� ֱ��(a&b)==0
public class Solution {
	public int bitAdd(int a,int b){	
		if(b==0)
	        return a;
		//���
	    int sum = a^b;    
	    //��λ
	    int carry =(a&b)<<1;
	    //�ݹ�
	    return bitAdd(sum,carry);
	 }
    
    public static void main(String[] arg){
    	Solution t = new Solution();
    	System.out.println(t.bitAdd(-10, 8));
    }
}

