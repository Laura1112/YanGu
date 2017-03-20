import java.util.Scanner;

/**
 * Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
 * @author Laura
 *
 */


public class Solution {
	 public static int[] plusOne(int[] digits) {
		        /*int carry = 1;  
		        int i = digits.length - 1;  
		  
		        for (; i >= 0; --i) {  
		            digits[i] += carry;  
		  
		            if (digits[i] >= 10) {  
		                digits[i] -= 10;  
		                carry = 1;  
		            } else {  
		                carry = 0;  
		                break;  
		            }  
		        }  
		  
		        if (i < 0) {  
		            int[] result = new int[digits.length + 1];  
		            result[0] = 1;  
		  
		            System.arraycopy(digits, 0, result, 1, digits.length);  
		  
		            return result;  
		        } else {  
		            return digits;  
		        }  */
		 
		/* //���ּ�һ
	        boolean carryFlag = false;
	        digits[digits.length - 1]++;
	        for (int i = digits.length - 1; i >= 0; i--) {
	            digits[i] = digits[i] + (carryFlag ? 1 : 0);
	            if (digits[i] >= 10) {
	                carryFlag = true;
	                digits[i] -= 10;
	            } else {
	                carryFlag = false;
	                break;
	            }
	        }
	        
	        //�ж��Ƿ������λ
	        if (carryFlag) {
	            int[] result = new int[digits.length + 1];
	            result[0] = 1;
	            for (int i = 1; i < result.length; i++){
	                result[i] = digits[i - 1];
	            }
	            return result;
	        } else {
	            return digits;
	        }*/
		 
		// Start typing your Java solution below
	        // DO NOT write main() function
	        int carry=0;
	        int len=digits.length-1;
	        //���ĩλ����9��ֱ�Ӽ�1����������
	if (digits[len]!=9)
	        {
	            digits[len]++;
	            return digits;
	        }
	        else 
	        {
	            int i=len;
	            while (i>=0)
	            {
	               //�����λ��9����λ���λΪ0��carryλΪ1��ѭ������һ��λ
	if (digits[i]==9)
	               {
	                   digits[i]++;
	                   carry=1;
	                   digits[i]=digits[i];
	                   i--;continue;
	               }
	               //�����λ����9��ֱ�Ӻ͵�λ�����Ľ�λcarry��ӣ�Ȼ�󷵻�
	else
	               {
	                   digits[i]+=carry;
	                   return digits;
	               }
	               
	            }
	            //������������������λ���н�λ����Ҫ��һ��λ�ô�š�(���� 99+1=100)���¿�һ������
	if (carry==1)
	            {
	                int[] newDigits=new int[digits.length+1];
	                newDigits[0]=1;
	                System.arraycopy(digits,0,newDigits,1,digits.length);
	                return newDigits;
	                
	            }
	            //default case������Ҫ���ദ��ֱ�ӷ�������
	else
	            {
	                return digits;
	            }
	        }
	    }
		   
	        

	 public static void main(String[] arg){
		 Scanner in = new Scanner(System.in);
		 int num = in.nextInt();
		 int[] digits = new int[num];
		 for(int i=0;i<num;i++)
			 digits[i] = in.nextInt();
		 for(int i=0;i<plusOne(digits).length;i++)
			 System.out.println(plusOne(digits)[i]);		 
	 }
}
