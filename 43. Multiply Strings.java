//题意：用字符串形式给出两个数，可以无限大，求这两个数的积，并以字符串形式表示

//遍历num1和num2的每一位，按常规求每一位的积，最终一共求得len1个积，最后再把这len1个积求和，即为给定两个数的积
public class Solution {
    public static String multiply(String num1, String num2) {
    	if(num1.equals("0")||num2.equals("0"))
    		return "0";
        int len1 = num1.length();
        int len2 = num2.length();
        String[] str = new String[len1];
        int tag = 0;
        int value = 0;
        //求的len1个积，存在str[i]中，即为列竖式求积的每一行
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
        
        //把每一行的积相加
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