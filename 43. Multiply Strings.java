//���⣺���ַ�����ʽ�������������������޴������������Ļ��������ַ�����ʽ��ʾ

//����num1��num2��ÿһλ����������ÿһλ�Ļ�������һ�����len1����������ٰ���len1������ͣ���Ϊ�����������Ļ�
public class Solution {
    public static String multiply(String num1, String num2) {
    	if(num1.equals("0")||num2.equals("0"))
    		return "0";
        int len1 = num1.length();
        int len2 = num2.length();
        String[] str = new String[len1];
        int tag = 0;
        int value = 0;
        //���len1����������str[i]�У���Ϊ����ʽ�����ÿһ��
        for(int i=len1-1;i>=0;i--){
            str[i] = "";
            tag = 0;
            for(int j=len2-1;j>=0;j--){
                value = Character.getNumericValue(num2.charAt(j))*Character.getNumericValue(num1.charAt(i))+tag;
                str[i] = value%10+str[i];
                tag = value/10;
            }
            if(tag!=0)
            	str[i] = tag+str[i];
            for(int k=0;k<len1-i-1;k++)
                str[i] = str[i]+"0";
        }
        
        //��ÿһ�еĻ����
        int k = 1;
        String rst = "";
        int jin = 0;
        for(int i=str[0].length()-1;i>=0;i--){
            int sum = jin;            
            for(int j=len1-1;j>=0;j--){
                if(str[j].length()-k>=0)
                     sum += str[j].charAt(str[j].length()-k)-'0';
            }
            rst = sum%10+rst;
            jin = sum/10;
            k++;
        }
        if(jin!=0)
        	rst = jin+rst;
        return rst;
    }
    
    public static void main(String[] args){
    	String n1 = "2345354788";
    	String n2 = "9773972";
    	System.out.println(multiply(n1,n2));
    }
}