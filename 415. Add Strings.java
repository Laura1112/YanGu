//���⣺�������ַ�����ʽ�����ֵĺͣ�����ת����int��
//�Ƚ������ַ�������һ�����ģ��ڽ϶�ǰ��0��
//�����һλ��ʼ��ӣ���һ��tag��ʾ��λ��Ȼ��٢�

public class Solution {  
	 public String addStrings(String num1, String num2){
    	String rst = "";
        int num1l = num1.length();
        int num2l = num2.length();
        //�ڽ϶��ַ���ǰ��0���������ַ������һ������
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
            //�н�λ��0-48,1-49,2-50��������9-57
            if(temp>105){
                tag = 1;
                rst = (temp - 106)+rst;
            }
            //�޽�λ
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