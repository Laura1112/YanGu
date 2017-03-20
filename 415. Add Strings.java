//题意：求两个字符串形式的数字的和，不能转化成int型
//先将两个字符串补成一样长的，在较短前加0；
//从最后一位开始相加，设一个tag表示进位，然后①②

public class Solution {  
	 public String addStrings(String num1, String num2){
    	String rst = "";
        int num1l = num1.length();
        int num2l = num2.length();
        //在较短字符串前加0，将两个字符串变成一样长的
        if(num1l>num2l){
            for(int i=0;i<num1l-num2l;i++)
                num2 = '0'+num2;
            num2l = num1l;
        }
        else if(num1l<num2l){
            for(int i=0;i<num2l-num1l;i++)
                num1 = '0'+num1;
            num1l = num2l;
        }
        int tag = 0;
        int temp = 0;
        for(int i=num1l-1;i>=0;i--){
            temp = tag+num1.charAt(i)+num2.charAt(i);
            //有进位，0-48,1-49,2-50，……，9-57
            if(temp>105){
                tag = 1;
                rst = (temp - 106)+rst;
            }
            //无进位
            else{
                tag = 0;
                rst = (temp - 96)+rst;
            }
        }
        if(tag==1)
            rst = '1'+rst;
        return rst;
    }
    
}