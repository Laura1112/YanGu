//���⣺��ν�һ������ֳɼ�������ӣ�ʹ���⼸���������������ֵ
//10=3+3+2+2��3��3��2��2=36 

//��̬�滮�����ʼ����ֵ����n>=6ʱ��rst[n]=rst[n-3]*3��
public class Solution {
    public int integerBreak(int n) {
        //nС��6ʱ��û�й��ɣ���ʼ��
        int[]  rst = new int[7];
        rst[1]=0;rst[2]=1;rst[3]=2;
        rst[4]=4;rst[5]=6;rst[6]=9;
        if(n<=6)
            return rst[n];
            
        //n����6ʱ����̬�滮��״̬ת�Ʒ���Ϊ rst[n]=rst[n-3]*3;    
        int z = n/3;
        int y = n%3;
        int base=1;
       
        if(y==1) base=4;
        if(y==2) base=6;
        if(y==0) base=3;
       
        for(int i=1;i<z;i++)
            base *=3;
        return base;
    }
}